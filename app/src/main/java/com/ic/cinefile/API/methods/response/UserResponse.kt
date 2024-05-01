package com.ic.cinefile.API.methods.response

import com.ic.cinefile.API.classMethods.users.UserModel

//aca van codigo, mensaje, y los datos, es la respuesta que se tiene al hacer la peticion
data class UserResponse(
    var code: String,
    var msg:String,
    var data:ArrayList<UserModel>
)

