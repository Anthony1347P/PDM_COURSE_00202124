package com.example.pdmcourse_00202124.Ejercicios


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import com.example.pdmcourse_00202124.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ejercicio1(){
    Column(modifier = Modifier
        .safeDrawingPadding()
        .fillMaxSize()
        .background(Color.White)) {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
        )
        Text(text = "Jetpack Compose Tutorial",
            modifier = Modifier
                .padding(16.dp),
            fontSize = 24.sp)
        Text(text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify)
        Text(text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify)
    }
}


@Composable
fun ejercicio2(){
    Column(modifier = Modifier
        .fillMaxSize()
        .safeDrawingPadding()
        .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = "",
        )
        Text(text = "All tasks completed",
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp),
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Nice work!",
            color = Color.Black,
            fontSize = 16.sp
        )
    }
}

@Composable
fun ejercicio3(){
    Column(modifier = Modifier
        .fillMaxSize()
        .safeDrawingPadding()
    ){
        Row(modifier = Modifier.weight(1f)){
            Box(modifier = Modifier
                .weight(1f)
                .background(Color(0xFFEADDFF))
                .fillMaxSize(),
            ){
                Column(modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Text composable",
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                    Text("Displays text and follows the recommended Material Design guidelines.",
                        textAlign = TextAlign.Justify)
                }

            }
            Box(modifier = Modifier
                .weight(1f)
                .background(Color(0xFFD0BCFF))
                .fillMaxSize()){
                Column(modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Image composable",
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                    Text("Creates a composable that lays out and draws a given Painter class object.",
                        textAlign = TextAlign.Justify)
                }
            }
        }
        Row(modifier = Modifier.weight(1f)){
            Box(modifier = Modifier
                .weight(1f)
                .background(Color(0xFFB69DF8))
                .fillMaxSize()){
                Column(modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Row composable",
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                    Text("A layout composable that places its children in a horizontal sequence.",
                        textAlign = TextAlign.Justify)
                }
            }
            Box(modifier = Modifier
                .weight(1f)
                .background(Color(0xFFF6EDFF))
                .fillMaxSize()){
                Column(modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Column composable",
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                    Text("A layout composable that places its children in a vertical sequence.\n",
                        textAlign = TextAlign.Justify)
                }
            }
        }

    }
}