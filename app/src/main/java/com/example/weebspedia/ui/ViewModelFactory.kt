package com.example.weebspedia.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weebspedia.data.WeebsPediaRepository
import com.example.weebspedia.ui.screen.categoryScreen.GenreViewModel
import com.example.weebspedia.ui.screen.detail.DetailViewModel
import com.example.weebspedia.ui.screen.home.HomeViewModel
import com.example.weebspedia.ui.screen.search.SearchViewModel

class ViewModelFactory(val repository: WeebsPediaRepository): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(HomeViewModel::class.java)){
            return HomeViewModel(repository) as T
        }else if(modelClass.isAssignableFrom(GenreViewModel::class.java)){
            return GenreViewModel(repository) as T
        } else if(modelClass.isAssignableFrom(DetailViewModel::class.java)){
            return DetailViewModel(repository) as T
        }else if(modelClass.isAssignableFrom(SearchViewModel::class.java)){
            return SearchViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}