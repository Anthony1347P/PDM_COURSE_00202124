package com.example.rankeuca2.repository

import com.example.rankeuca2.model.Option
import kotlinx.coroutines.flow.Flow

interface OptionRepository {
    fun getOptions(questionId: Int): Flow<List<Option>>
    suspend fun addOption(name: String, imageUrl: String, questionId: Int)
    suspend fun deleteOption(option: Option)
}