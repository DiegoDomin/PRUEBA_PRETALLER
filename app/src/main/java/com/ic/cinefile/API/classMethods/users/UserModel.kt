package com.ic.cinefile.API.classMethods.users

data class UserModel(
    //aca van los campos al obtener /o al crear usuario
    var username:String,
    var email:String,
    var password:String,
    var year_nac:String,
    var genere:String,
    var movie_genere:String,
    var avatar:String,

)
