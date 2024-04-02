package com.example.composebasic3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasic3.ui.theme.ComposeBasic3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasic3Theme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun Greeting() {
        Box(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxSize()
        ) {
            Card(

                colors = CardDefaults.cardColors(
                    containerColor = Color(240, 235, 250),


                    ),
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth(0.45f)
                    .fillMaxHeight(0.45f),


                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Text composable",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 18.dp),

                        )

                    Text(
                        text = "Display text and follows" + "the recommended Material Design guidelines.",
                        lineHeight = 25.sp,
                        textAlign = TextAlign.Justify,

                        )
                }

            }

            Card(

                colors = CardDefaults.cardColors(
                    containerColor = Color(250, 267, 231),


                    ),
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth(0.45f)
                    .fillMaxHeight(0.45f)
                    .align(Alignment.TopEnd),


                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Image Composable",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 18.dp),

                        )

                    Text(
                        text = "Creates a composable that lays out" + "and draws a given Painter class Object.",
                        lineHeight = 25.sp,
                        textAlign = TextAlign.Justify,

                        )
                }

            }

            Card(

                colors = CardDefaults.cardColors(
                    containerColor = Color(100, 10, 200),


                    ),
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth(0.45f)
                    .fillMaxHeight(0.45f)
                    .align(Alignment.BottomStart),


                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Row composable",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 18.dp),

                        )

                    Text(
                        text = "A layout composable that places " + "and draws a given Painter class Object.",
                        lineHeight = 15.sp,
                        textAlign = TextAlign.Justify,

                        )
                }

            }

            Card(

                colors = CardDefaults.cardColors(
                    containerColor = Color(209, 196, 233),
                ),
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth(0.45f)
                    .fillMaxHeight(0.45f)
                    .align(Alignment.BottomEnd),

                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(18.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Compose Basic",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 18.dp),

                        )

                    Text(
                        text = "A layout composable that places its children in a vertical sequence" + "its children in a vertical sequence",
                        lineHeight = 15.sp,
                        textAlign = TextAlign.Justify,

                        )
                }

            }


        }

    }

}
