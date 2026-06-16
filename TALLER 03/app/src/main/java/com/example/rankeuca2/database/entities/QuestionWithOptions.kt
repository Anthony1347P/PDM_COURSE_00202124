package com.example.rankeuca2.database.entities

import androidx.room.Embedded
import androidx.room.Relation
import com.example.rankeuca2.model.Question

data class QuestionWithOptions(
    @Embedded val question: QuestionEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "questionId"
    )
    val options: List<OptionEntity>
)

fun QuestionWithOptions.toModel(): Question {
    return Question(
        id          = question.id,
        title       = question.title,
        optionCount = options.size,
    )
}