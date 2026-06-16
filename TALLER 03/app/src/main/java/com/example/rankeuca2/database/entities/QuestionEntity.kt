package com.example.rankeuca2.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.rankeuca2.model.Question

@Entity(tableName = "questions")
data class QuestionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
)

fun QuestionEntity.toModel(): Question {
    return Question(
        id          = id,
        title       = title,
        optionCount = 0,
    )
}

fun Question.toEntity(): QuestionEntity {
    return QuestionEntity(
        id    = id,
        title = title,
    )
}