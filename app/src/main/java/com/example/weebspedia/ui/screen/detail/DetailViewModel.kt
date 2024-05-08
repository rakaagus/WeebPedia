package com.example.weebspedia.ui.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weebspedia.data.WeebsPediaRepository
import com.example.weebspedia.model.AnimeData
import com.example.weebspedia.model.Genre
import com.example.weebspedia.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class DetailViewModel(private val repository: WeebsPediaRepository): ViewModel() {

    private val _animeDetailUiState: MutableStateFlow<UiState<AnimeData>> = MutableStateFlow(
        UiState.Loading
    )
    val animeDetailUiState: StateFlow<UiState<AnimeData>>
        get() = _animeDetailUiState

    val _genreInAnimeUiState: MutableStateFlow<UiState<List<Genre>>> = MutableStateFlow(
        UiState.Loading
    )
    val genreInAnimeUiState: StateFlow<UiState<List<Genre>>>
        get() = _genreInAnimeUiState

    fun getDetailAnime(animeId: Long) = viewModelScope.launch {
        _animeDetailUiState.value = UiState.Loading
        _animeDetailUiState.value = UiState.Success(repository.getAnimeById(animeId))
    }

    fun getGenreInAnime(animeIdList: List<Int>){
        viewModelScope.launch {
            repository.getGenreInAnime(animeIdList)
                .catch {
                    _genreInAnimeUiState.value = UiState.Error(it.message.toString())
                }
                .collect{
                    _genreInAnimeUiState.value = UiState.Success(it)
                }
        }
    }
}