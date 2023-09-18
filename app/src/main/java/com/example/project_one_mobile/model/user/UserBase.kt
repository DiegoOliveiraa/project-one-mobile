package com.example.project_one_mobile.model.user

open class UserBase(
    val email: String,
    val password: String,
    val fullname: String,
    val photo: String,
    val telefone: String,
    cpf: String,
    address: String,
    city: String,
    state: String,
    cep: String
) : AddressHome(
    address,
    city,
    state,
    cep
)