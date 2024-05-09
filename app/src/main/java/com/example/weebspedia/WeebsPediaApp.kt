package com.example.weebspedia

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.weebspedia.ui.navigation.NavigationItem
import com.example.weebspedia.ui.navigation.Screen
import com.example.weebspedia.ui.screen.categoryScreen.GenreScreen
import com.example.weebspedia.ui.screen.detail.DetailScreen
import com.example.weebspedia.ui.screen.home.HomeScreen
import com.example.weebspedia.ui.screen.profile.ProfileScreen
import com.example.weebspedia.ui.screen.search.SearchScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeebsPediaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val title = when(currentRoute) {
        "home_screen" -> stringResource(id = R.string.home_title)
        "search_screen" -> stringResource(id = R.string.search_anime)
        "profile_screen" -> stringResource(id = R.string.profile_title)
        else -> ""
    }

    Scaffold(
        bottomBar = {
            if (currentRoute == Screen.DetailScreen.route) {

            }  else if (currentRoute == Screen.GenreScreen.route){

            }else {
                BottomAppBar(navController)
            }
        },
        topBar = {
            if (currentRoute == Screen.DetailScreen.route) {

            } else if (currentRoute == Screen.GenreScreen.route){

            } else {
                CenterAlignedTopAppBar(title = {
                    Text(text = title, color = Color.White)
                })
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.HomeScreen.route,
            modifier = modifier.padding(innerPadding)
        ) {
            composable(Screen.HomeScreen.route) {
                HomeScreen(clickToDetail = {animeId ->
                    navController.navigate(Screen.DetailScreen.createRoute(animeId))
                }, clickToGenre = {genreId ->
                    navController.navigate(Screen.GenreScreen.createRoute(genreId))
                })
            }
            composable(Screen.ProfileScreen.route) {
                ProfileScreen()
            }
            composable(Screen.SearchScreen.route) {
                SearchScreen(clickToDetail = {animeId ->
                    navController.navigate(Screen.DetailScreen.createRoute(animeId))
                })
            }
            composable(Screen.GenreScreen.route,
                arguments = listOf(
                    navArgument("genreId") { type = NavType.IntType }
                )
            ){
                val id = it.arguments?.getInt("genreId", 1) ?: 1
                GenreScreen(navController = navController, genreId = id)
            }
            composable(Screen.DetailScreen.route,
                arguments = listOf(
                    navArgument("animeId") {type = NavType.LongType}
                )
            ) {
                val id = it.arguments?.getLong("animeId") ?: 1
                DetailScreen(navController = navController, animeId = id, clickToGenre = {genreId ->
                    navController.navigate(Screen.GenreScreen.createRoute(genreId))
                })
            }
        }

    }
}


@Composable
fun BottomAppBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.home_title),
                imageVector = Icons.Filled.Home,
                screen = Screen.HomeScreen
            ),
            NavigationItem(
                title = stringResource(id = R.string.search_anime),
                imageVector = Icons.Filled.Search,
                screen = Screen.SearchScreen
            ),
            NavigationItem(
                title = stringResource(id = R.string.profile_title),
                imageVector = Icons.Default.AccountCircle,
                screen = Screen.ProfileScreen
            ),
        )
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route){
                        popUpTo(navController.graph.findStartDestination().id){
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(imageVector = item.imageVector, contentDescription = item.title)
                },
                label = {
                    Text(
                        text = item.title
                    )
                })
        }
    }
}