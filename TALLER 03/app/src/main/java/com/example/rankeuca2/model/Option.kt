package com.example.rankeuca2.model

data class Option(
    val id: Int = 0,
    val name: String,
    val imageUrl: String,
    val questionId: Int = 0,    // FK a la pregunta a la que pertenece
)