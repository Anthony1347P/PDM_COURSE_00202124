package com.example.rankeuca2

import android.content.Context
import com.example.rankeuca2.database.AppDatabase
import com.example.rankeuca2.repository.OptionRepository
import com.example.rankeuca2.repository.OptionRepositoryImpl

class AppProvider(context: Context) {

    private val appDatabase = AppDatabase.getDatabase(context)
    private val optionDao = appDatabase.optionDao()

    private val optionRepository: OptionRepository =
        OptionRepositoryImpl(optionDao)

    fun provideOptionRepository(): OptionRepository {
        return optionRepository
    }
}