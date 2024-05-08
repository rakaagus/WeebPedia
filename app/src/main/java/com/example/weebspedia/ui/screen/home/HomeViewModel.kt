package com.example.weebspedia.ui.screen.home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weebspedia.data.WeebsPediaRepository
import com.example.weebspedia.model.AnimeData
import com.example.weebspedia.model.Article
import com.example.weebspedia.model.Genre
import com.example.weebspedia.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class HomeViewModel(private val repository: WeebsPediaRepository): ViewModel() {

    private val _genreUiState: MutableStateFlow<UiState<List<Genre>>> = MutableStateFlow(
        UiState.Loading
    )
    val genreUiState: StateFlow<UiState<List<Genre>>>
        get() = _genreUiState

    private val _articleUiState: MutableStateFlow<UiState<List<Article>>> = MutableStateFlow(
        UiState.Loading
    )
    val articleUiState: StateFlow<UiState<List<Article>>>
        get() = _articleUiState

    private val _topAnimeUiState: MutableStateFlow<UiState<List<AnimeData>>> = MutableStateFlow(
        UiState.Loading
    )
    val topAnime: StateFlow<UiState<List<AnimeData>>>
        get() = _topAnimeUiState

    fun getAllGenre(){
        viewModelScope.launch {
            repository.getAllGenres()
                .catch {
                    _genreUiState.value = UiState.Error(it.message.toString())
                }
                .collect{data ->
                    _genreUiState.value = UiState.Success(data)
                }
        }
    }

    fun getAllArticle(){
        viewModelScope.launch {
            repository.getAllArticle()
                .catch {
                    _articleUiState.value = UiState.Error(it.message.toString())
                }
                .collect{data ->
                    _articleUiState.value = UiState.Success(data)
                }
        }
    }

    fun getTopAnime(){
        viewModelScope.launch {
            repository.getTopAnimeSelection()
                .catch {
                    _topAnimeUiState.value = UiState.Error(it.message.toString())
                }
                .collect{data ->
                    _topAnimeUiState.value = UiState.Success(data)
                }
        }
    }
}