package com.example.weebspedia.ui.screen.categoryScreen

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

class GenreViewModel(private val repository: WeebsPediaRepository): ViewModel() {

    private val _animeInGenreUiState: MutableStateFlow<UiState<List<AnimeData>>> = MutableStateFlow(
        UiState.Loading
    )
    val animeInGenreUiState: StateFlow<UiState<List<AnimeData>>>
        get() = _animeInGenreUiState

    private val _genreUiState: MutableStateFlow<UiState<Genre>> = MutableStateFlow(
        UiState.Loading
    )
    val genreUiState: StateFlow<UiState<Genre>>
        get() = _genreUiState

    fun getAnimeInGenre(genreId: Int){
        viewModelScope.launch {
            repository.getAnimeByGenreId(genreId)
                .catch {
                    _animeInGenreUiState.value = UiState.Error(it.message.toString())
                }
                .collect{
                    _animeInGenreUiState.value = UiState.Success(it)
                }
        }
    }

    fun getGenreById(genreId: Int){
        _genreUiState.value = UiState.Loading
        _genreUiState.value = UiState.Success(repository.getGenre(genreId))
    }

}