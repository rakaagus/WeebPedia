package com.example.weebspedia.ui.screen.detail

import android.accounts.AuthenticatorDescription
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.weebspedia.model.AnimeData
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.weebspedia.R
import com.example.weebspedia.di.Injection
import com.example.weebspedia.ui.ViewModelFactory
import com.example.weebspedia.ui.common.UiState
import com.example.weebspedia.ui.components.CustomTopNavigationBar
import com.example.weebspedia.ui.components.GenreTextButton
import com.example.weebspedia.ui.components.RatingComponent

@Composable
fun DetailScreen(
    navController: NavController,
    animeId: Long,
    clickToGenre: (Int) -> Unit,
    viewModel: DetailViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        viewModel.animeDetailUiState.collectAsState(initial = UiState.Loading).value.let { state ->
            when (state) {
                is UiState.Loading -> {
                    viewModel.getDetailAnime(animeId)
                }

                is UiState.Error -> {

                }

                is UiState.Success -> {
                    val dataAnime = state.data
                    DetailContent(
                        navController = navController,
                        clickToGenre = clickToGenre,
                        viewModel = viewModel,
                        title = dataAnime.title,
                        imageUrl = dataAnime.imageUrl,
                        description = dataAnime.description,
                        genreListId = dataAnime.genreId,
                        rating = dataAnime.rating,
                        eps = dataAnime.eps,
                        date = dataAnime.date,
                        statusEnd = dataAnime.statusEnd
                    )
                }
            }
        }
    }
}

@Composable
fun DetailContent(
    navController: NavController,
    clickToGenre: (Int) -> Unit,
    viewModel: DetailViewModel,
    title: String,
    imageUrl: String,
    description: String,
    genreListId: List<Int>,
    rating: Double,
    eps: Int,
    date: String,
    statusEnd: Boolean,
    modifier: Modifier = Modifier
) {
    CustomTopNavigationBar(title = title, navController = navController)
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 10.dp)
            .verticalScroll(rememberScrollState())
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(imageUrl)
                .crossfade(true)
                .build(),
            error = painterResource(id = R.drawable.placeholder),
            contentDescription = "AnimeImage",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 12.dp, bottom = 10.dp)
        ) {
            RatingComponent(rating = rating.toString())
            Text(text = date, style = MaterialTheme.typography.labelSmall, color = Color.White)
            Text(text = "Eps $eps", style = MaterialTheme.typography.labelSmall, color = Color.White)
            if (statusEnd){
                Text(text = "Sudah Tamat", style = MaterialTheme.typography.labelSmall, color = Color.White)
            }else {
                Text(text = "Ongoing", style = MaterialTheme.typography.labelSmall, color = Color.White)
            }
        }
        viewModel.genreInAnimeUiState.collectAsState(initial = UiState.Loading).value.let { state ->
            when (state) {
                is UiState.Loading -> {
                    viewModel.getGenreInAnime(genreListId)
                }

                is UiState.Error -> {}
                is UiState.Success -> {
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        contentPadding = PaddingValues(16.dp),
                    ) {
                        items(state.data) { genres ->
                            GenreTextButton(name = genres.name, genreId = genres.id, clickToGenreScreen = clickToGenre)
                        }
                    }
                }
            }
        }
        Text(
            text = description,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 12.dp)
        )
    }
}
