package com.ic.cinefile.API.methods.response

import com.google.gson.annotations.SerializedName
import com.ic.cinefile.API.classMethods.movies.MoviesModel

//son los datos que traera a la llamada de la api
data class MovieResponse(
    @SerializedName("results")
    var results:List<MoviesModel>
)
