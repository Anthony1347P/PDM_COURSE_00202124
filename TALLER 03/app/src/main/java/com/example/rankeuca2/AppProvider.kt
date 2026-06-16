package com.example.rankeuca2

import android.content.Context
import com.example.rankeuca2.database.AppDatabase
import com.example.rankeuca2.repository.OptionRepository
import com.example.rankeuca2.repository.OptionRepositoryImpl
import com.example.rankeuca2.repository.QuestionRepository
import com.example.rankeuca2.repository.QuestionRepositoryImpl

class AppProvider(context: Context) {

    private val appDatabase = AppDatabase.getDatabase(context)

    private val questionDao = appDatabase.questionDao()
    private val optionDao   = appDatabase.optionDao()

    private val questionRepository: QuestionRepository =
        QuestionRepositoryImpl(questionDao)

    private val optionRepository: OptionRepository =
        OptionRepositoryImpl(optionDao)

    fun provideQuestionRepository(): QuestionRepository = questionRepository

    fun provideOptionRepository(): OptionRepository = optionRepository
}