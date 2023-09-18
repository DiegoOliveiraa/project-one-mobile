package com.example.project_one_mobile.model.user

class UserClient(
    email: String,
    senha: String,
    nome: String,
    photo: String,
    telefone: String,
    complemento: String,
    bairro: String,
    cpf: String,
    city: String,
    state: String,
    cep: String
) : UserBase(
    email,
    senha,
    nome,
    photo,
    telefone,
    complemento,
    bairro,
    city,
    state,
    cep,
) {

//    fun createUser(): UserClient {
//        return UserClient(
//            nome = nome,
//            photo = photo,
//            premium = premium,
//            email = email
//        )
//    }

}
