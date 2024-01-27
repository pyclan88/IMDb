package com.practicum.imdb

import com.practicum.imdb.data.MoviesRepositoryImpl
import com.practicum.imdb.data.network.RetrofitNetworkClient
import com.practicum.imdb.domain.api.MoviesInteractor
import com.practicum.imdb.domain.api.MoviesRepository
import com.practicum.imdb.domain.impl.MoviesInteractorImpl

object Creator {
    private fun getMoviesRepository(): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient())
    }

    fun provideMoviesInteractor(): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository())
    }
}