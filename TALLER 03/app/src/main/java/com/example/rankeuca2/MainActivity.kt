package com.example.rankeuca2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.rankeuca2.screens.OptionsScreen
import com.example.rankeuca2.screens.QuestionsScreen
import com.example.rankeuca2.ui.theme.RankeUca2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RankeUca2Theme {
                var currentQuestionId by remember { mutableStateOf<Int?>(null) }

                if (currentQuestionId == null) {
                    QuestionsScreen(
                        onQuestionClick = { id -> currentQuestionId = id }
                    )
                } else {
                    BackHandler { currentQuestionId = null }
                    OptionsScreen(questionId = currentQuestionId!!)
                }
            }
        }
    }
}