package com.example.weebspedia.data

import com.example.weebspedia.model.AnimeData
import com.example.weebspedia.model.Article
import com.example.weebspedia.model.Genre
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf

class WeebsPediaRepository {

    private val topAnimeById: List<Long> = listOf(
        2, 3, 4, 5, 7, 8, 15, 14, 12, 10
    )
    private val animeTopSelection = mutableListOf<AnimeData>()
    private val articles = mutableListOf<Article>()
    private val genres = mutableListOf<Genre>()
    private val animeByGenreId = mutableListOf<AnimeData>()
    private val allDataAnime = mutableListOf<AnimeData>()
    private val genreInAnime = mutableListOf<Genre>()

    init {
        if(articles.isEmpty()){
            DataSource.articleList().forEach {
                articles.add(it)
            }
        }

        if(genres.isEmpty()){
            DataSource.genreList().forEach {
                genres.add(it)
            }
        }

        if(animeTopSelection.isEmpty()){
            DataSource.animeList().forEach {
                if(it.id in topAnimeById){
                    animeTopSelection.add(it)
                }
            }
        }

        if(allDataAnime.isEmpty()){
            DataSource.animeList().forEach {
                allDataAnime.add(it)
            }
        }
    }

    fun getAllArticle(): Flow<List<Article>>{
        return flowOf(articles)
    }

    fun getAllGenres(): Flow<List<Genre>>{
        return flowOf(genres)
    }

    fun getTopAnimeSelection(): Flow<List<AnimeData>>{
        return flowOf(animeTopSelection)
    }

    fun getAllAnimeList(): Flow<List<AnimeData>>{
        return flowOf(allDataAnime)
    }

    fun getGenreInAnime(genreIdList: List<Int>): Flow<List<Genre>>{
        genreInAnime.clear()
        DataSource.genreList().forEach { genre ->
            if(genre.id in genreIdList){
                genreInAnime.add(genre)
            }
        }
        return flowOf(genreInAnime)
    }

    fun getAnimeByGenreId(genreId: Int): Flow<List<AnimeData>>{
        animeByGenreId.clear()
        DataSource.animeList().filter {data ->
            data.genreId.contains(genreId)
        }.forEach {anime ->
            animeByGenreId.add(anime)
        }

        return flowOf(animeByGenreId)
    }

    fun getGenre(genreId: Int): Genre {
        return genres.first{
            it.id == genreId
        }
    }

    fun getAnimeById(animeId: Long): AnimeData {
        return allDataAnime.first{
            it.id == animeId
        }
    }

    fun searchAnimeByTitle(title: String) = flow {
        val data = allDataAnime.filter { anime ->
            anime.title.contains(title, ignoreCase = true)
        }
        emit(data)
    }

    companion object{
        @Volatile
        private var instance: WeebsPediaRepository? = null

        fun getInstance(): WeebsPediaRepository =
            instance ?: synchronized(this){
                WeebsPediaRepository().apply {
                    instance = this
                }
            }
    }
}