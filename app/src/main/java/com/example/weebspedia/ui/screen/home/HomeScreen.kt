package com.example.weebspedia.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.weebspedia.di.Injection
import com.example.weebspedia.ui.ViewModelFactory
import com.example.weebspedia.ui.common.UiState
import com.example.weebspedia.ui.components.AnimeArticleCard
import com.example.weebspedia.ui.components.ColumnAnimeCard
import com.example.weebspedia.ui.components.GenreTextButton
import com.example.weebspedia.ui.components.SearchIconBottom
import com.example.weebspedia.ui.components.SectionText
import com.example.weebspedia.ui.navigation.Screen

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    clickToDetail: (Long) -> Unit,
    clickToGenre: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    HomeContent(viewModel = viewModel, clickToDetail = clickToDetail, clickToGenre = clickToGenre, modifier = modifier)
}

@Composable
fun HomeContent(
    viewModel: HomeViewModel,
    clickToDetail: (Long) -> Unit,
    clickToGenre: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = modifier.padding(horizontal = 12.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(
                        vertical = 5.dp,
                        horizontal = 5.dp
                    )
            ) {
                Text(text = "Welcome back")
                Text(
                    text = "Raka Agus Maulana",
                    fontSize = 16.sp,
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.ExtraBold
                    )
                )
            }
        }
        SectionText(title = "Genre", content = {
            viewModel.genreUiState.collectAsState(initial = UiState.Loading).value.let { state->
                when(state){
                    is UiState.Loading -> {
                        viewModel.getAllGenre()
                    }
                    is UiState.Error -> {}
                    is UiState.Success -> {
                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            contentPadding = PaddingValues(16.dp),
                        ) {
                            items(state.data){ genres ->
                                GenreTextButton(name = genres.name, genreId = genres.id, clickToGenreScreen = clickToGenre)
                            }
                        }
                    }
                }
            }
        })
        SectionText(title = "Top Anime", content = {
              viewModel.topAnime.collectAsState(initial = UiState.Loading).value.let { state ->
                  when(state){
                      is UiState.Loading -> {
                          viewModel.getTopAnime()
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
                                  ColumnAnimeCard(animeData = data, clickToDetail = clickToDetail)
                              }
                          }
                      }
                  }
              }
        })
        SectionText(title = "Article", content = {
            viewModel.articleUiState.collectAsState(initial = UiState.Loading).value.let { state ->
                when(state){
                    is UiState.Loading -> {
                        viewModel.getAllArticle()
                    }
                    is UiState.Error -> {}
                    is UiState.Success -> {
                        LazyColumn(
                            verticalArrangement = Arrangement.spacedBy(4.dp),
                            contentPadding = PaddingValues(horizontal = 16.dp),
                            modifier = Modifier
                                .height(500.dp)
                                .fillMaxWidth()
                        ) {
                            items(state.data){ article ->
                                AnimeArticleCard(article = article)
                            }
                        }
                    }
                }
            }
        })
    }
}