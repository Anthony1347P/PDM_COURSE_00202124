package com.example.rankeuca2.repository

import com.example.rankeuca2.database.dao.QuestionDao
import com.example.rankeuca2.database.entities.QuestionEntity
import com.example.rankeuca2.database.entities.toModel
import com.example.rankeuca2.database.entities.toEntity
import com.example.rankeuca2.model.Question
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class QuestionRepositoryImpl(
    private val questionDao: QuestionDao
) : QuestionRepository {

    override fun getQuestions(): Flow<List<Question>> {
        return questionDao.getQuestionsWithOptions().map { list ->
            list.map { it.toModel() }
        }
    }

    override suspend fun addQuestion(title: String) {
        questionDao.insertQuestion(QuestionEntity(title = title))
    }

    override suspend fun deleteQuestion(question: Question) {
        questionDao.deleteQuestion(question.toEntity())
    }
}