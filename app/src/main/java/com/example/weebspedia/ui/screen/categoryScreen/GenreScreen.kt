package com.example.weebspedia.ui.screen.categoryScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.weebspedia.di.Injection
import com.example.weebspedia.ui.ViewModelFactory
import com.example.weebspedia.ui.common.UiState
import com.example.weebspedia.ui.components.ColumnAnimeCard
import com.example.weebspedia.ui.components.CustomTopNavigationBar
import com.example.weebspedia.ui.screen.detail.DetailViewModel

@Composable
fun GenreScreen(
    navController: NavController,
    genreId: Int,
    viewModel: GenreViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    modifier: Modifier = Modifier
) {

    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier.fillMaxSize()
    ) {
        viewModel.genreUiState.collectAsState(initial = UiState.Loading).value.let {state ->
            when(state){
                is UiState.Loading -> {
                    viewModel.getGenreById(genreId)
                }
                is UiState.Error -> {}
                is UiState.Success -> {
                    CustomTopNavigationBar(title = state.data.name, navController = navController)
                }
            }
        }

        viewModel.animeInGenreUiState.collectAsState().value.let { state ->
            when(state){
                is UiState.Loading -> {
                    viewModel.getAnimeInGenre(genreId)
                }
                is UiState.Error -> {}
                is UiState.Success -> {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 4.dp)
                            .height(350.dp)
                    ) {
                        items(state.data){data ->
                            ColumnAnimeCard(animeData = data, clickToDetail = {})
                        }
                    }
                }
            }
        }
    }
}