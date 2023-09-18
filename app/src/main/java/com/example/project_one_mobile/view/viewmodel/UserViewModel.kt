package com.example.project_one_mobile.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.project_one_mobile.data.repository.Repository

class UserViewModel(repository: Repository) : ViewModel() {


    val loginUser = repository.loginUser

    fun login(username: String, password: String, email: String) {


    }


}
