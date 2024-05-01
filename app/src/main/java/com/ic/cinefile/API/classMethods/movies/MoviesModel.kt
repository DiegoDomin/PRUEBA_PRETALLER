package com.ic.cinefile.API.classMethods.movies

import com.google.gson.annotations.SerializedName

data class MoviesModel(
    @SerializedName("id")
    var movie_id:Int,

    @SerializedName("poster_path")
    var poster_path:String,

    @SerializedName("original_title")
    var title:String,

    @SerializedName("release_date")
    var release_date:String,

    @SerializedName("runtime")
    var runtime:Float,

    @SerializedName("video")
    var video:Boolean,

    @SerializedName("overview")
    var overview:String,

    @SerializedName("genres")
    var genres:String,

)
