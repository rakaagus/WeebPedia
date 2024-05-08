package com.example.weebspedia.ui.screen.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.weebspedia.di.Injection
import com.example.weebspedia.ui.ViewModelFactory
import com.example.weebspedia.ui.common.UiState
import com.example.weebspedia.ui.components.ColumnAnimeCard
import com.example.weebspedia.ui.components.CustomTopNavigationBar
import com.example.weebspedia.ui.components.SearchAnime

@Composable
fun SearchScreen(
    clickToDetail: (Long) -> Unit,
    viewModel: SearchViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    modifier: Modifier = Modifier
) {
    val query by viewModel.query
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        SearchAnime(query = query, onQueryChange = viewModel::searchAnimeWithTitle, modifier = Modifier.padding(horizontal = 12.dp))
        viewModel.allAnimeUiState.collectAsState(initial = UiState.Loading).value.let { state ->
            when(state){
                is UiState.Loading -> {
                    viewModel.getAllAnimeData()
                }
                is UiState.Error -> {}
                is UiState.Success -> {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 12.dp, vertical = 4.dp)
                            .height(350.dp)
                    ) {
                        items(state.data){data ->
                            ColumnAnimeCard(animeData = data, clickToDetail = clickToDetail)
                        }
                    }
                }
            }
        }
    }
}