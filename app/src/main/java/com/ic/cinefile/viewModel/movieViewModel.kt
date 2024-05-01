package com.ic.cinefile.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ic.cinefile.API.classMethods.movies.MoviesModel
import androidx.lifecycle.viewModelScope
import com.ic.cinefile.API.apiServer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit

class movieViewModel: ViewModel() {
    private var movieList=MutableLiveData<List<MoviesModel>>()

    val _movieList:LiveData<List<MoviesModel>> = movieList

    fun getAllMovie() {
        viewModelScope.launch(Dispatchers.IO){
            val response= apiServer.methods.getMovies()


        }
    }
}