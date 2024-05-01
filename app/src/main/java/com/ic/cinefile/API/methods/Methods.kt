package com.ic.cinefile.API.methods

import com.ic.cinefile.API.classMethods.users.UserModel
import com.ic.cinefile.API.methods.response.MovieResponse
import com.ic.cinefile.API.methods.response.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface Methods {
    @POST("api/account/register")
    suspend fun createAccount(
        @Body user: UserModel
    ): Response<UserResponse>


    //Movies
    @GET("api/movies/movieAll")
    suspend fun getMovies(): Response<MovieResponse>

}