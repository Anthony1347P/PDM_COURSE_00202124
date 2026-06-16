package com.example.rankeuca2.repository

import com.example.rankeuca2.model.Question
import kotlinx.coroutines.flow.Flow

interface QuestionRepository {
    fun getQuestions(): Flow<List<Question>>
    suspend fun addQuestion(title: String)
    suspend fun deleteQuestion(question: Question)
}