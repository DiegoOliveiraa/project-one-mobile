package com.example.project_one_mobile.data.dao

import androidx.room.Database
import com.example.project_one_mobile.model.user.UserBase


@Database(entities = [UserDaoLocal::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return instance?: synchronized(this) {
                instance?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "my-database")
                .build()
        }
    }
}
