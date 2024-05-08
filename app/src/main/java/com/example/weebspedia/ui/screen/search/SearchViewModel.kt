package com.example.weebspedia.ui.screen.search

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weebspedia.data.WeebsPediaRepository
import com.example.weebspedia.model.AnimeData
import com.example.weebspedia.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import androidx.compose.runtime.State

class SearchViewModel(private val repository: WeebsPediaRepository): ViewModel() {
    private val _allAnimeUiState: MutableStateFlow<UiState<List<AnimeData>>> = MutableStateFlow(
        UiState.Loading
    )

    val allAnimeUiState: StateFlow<UiState<List<AnimeData>>>
        get() = _allAnimeUiState

    private val _query = mutableStateOf("")
    val query: State<String>
        get() = _query

    fun getAllAnimeData(){
        viewModelScope.launch {
            repository.getAllAnimeList()
                .catch {
                    _allAnimeUiState.value = UiState.Error(it.message.toString())
                }
                .collect{data ->
                    _allAnimeUiState.value = UiState.Success(data)
                }
        }
    }

    fun searchAnimeWithTitle(title: String) = viewModelScope.launch {
        _query.value = title
        repository.searchAnimeByTitle(_query.value)
            .catch {
                _allAnimeUiState.value = UiState.Error(it.message.toString())
            }
            .collect{data ->
                _allAnimeUiState.value = UiState.Success(data)
            }
    }
}