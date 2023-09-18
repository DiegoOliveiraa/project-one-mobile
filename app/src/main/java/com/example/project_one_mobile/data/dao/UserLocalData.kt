package com.example.project_one_mobile.data.dao

import androidx.room.Entity


@Entity
class UserDaoLocal(
    var id: Int,
    var name: String,
    var email: String,
    var password: String
)