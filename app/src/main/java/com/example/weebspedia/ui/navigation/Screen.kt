package com.example.weebspedia.ui.navigation

sealed class Screen (val route: String, val nameScreen: String){
    object HomeScreen: Screen("home_screen", "Home")
    object ProfileScreen: Screen("profile_screen", "Profile")
    object GenreScreen: Screen("genre_screen/{genreId}", "Genre Screen"){
        fun createRoute(genreId: Int) = "genre_screen/$genreId"
    }
    object DetailScreen: Screen("home_screen/{animeId}", "Detail"){
        fun createRoute(animeId: Long) = "home_screen/$animeId"
    }
    object SearchScreen: Screen("search_screen", "Search")
}