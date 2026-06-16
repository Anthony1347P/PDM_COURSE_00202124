package com.example.rankeuca2.repository

import com.example.rankeuca2.database.dao.OptionDao
import com.example.rankeuca2.database.entities.toEntity
import com.example.rankeuca2.database.entities.toModel
import com.example.rankeuca2.model.Option
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class OptionRepositoryImpl(
    private val optionDao: OptionDao
) : OptionRepository {

    override fun getOptions(questionId: Int): Flow<List<Option>> {
        return optionDao.getOptionsForQuestion(questionId).map { entities ->
            entities.map { it.toModel() }
        }
    }

    override suspend fun addOption(name: String, imageUrl: String, questionId: Int) {
        val option = Option(name = name, imageUrl = imageUrl, questionId = questionId)
        optionDao.insertOption(option.toEntity())
    }

    override suspend fun deleteOption(option: Option) {
        optionDao.deleteOption(option.toEntity())
    }
}