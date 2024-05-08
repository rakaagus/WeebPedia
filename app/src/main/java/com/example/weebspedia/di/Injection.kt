package com.example.weebspedia.di

import com.example.weebspedia.data.WeebsPediaRepository

object Injection {
    fun provideRepository(): WeebsPediaRepository{
        return WeebsPediaRepository.getInstance()
    }
}