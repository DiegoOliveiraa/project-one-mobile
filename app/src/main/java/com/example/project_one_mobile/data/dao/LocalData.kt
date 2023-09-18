package com.example.project_one_mobile.data.dao

import androidx.room.Room


class LocalData(){
    val database: AppDataBase by lazy {
        Room.databaseBuilder(
            this,
            AppDataBase::class.java,
            "app_database"
        ).build()
    }
}