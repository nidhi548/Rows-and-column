package com.example.rowsandcolumn

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rowsandcolumn.State.Companion.ColorBox
import com.example.rowsandcolumn.ui.theme.RowsAndColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowsAndColumnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
//                    Column(
//                        modifier = Modifier
//                            .background(Color.Green)
//                            .fillMaxSize()
//                            .width(600.dp)
////                            .requiredWidth(600.dp)
//                            .border(5.dp, Color.Magenta)
//                            .padding(16.dp)
//                            .border(5.dp, Color.Blue)
//                            .padding(16.dp)
//                            .border(5.dp, Color.Red)
////                        horizontalAlignment = Alignment.CenterHorizontally,
////                        verticalArrangement = Arrangement.SpaceAround
//                    ) {
//                        Text(
//                            text = "Hi",
////                            modifier = Modifier.offset(50.dp, 20.dp)
//                        )
//                        Spacer(modifier = Modifier.height(50.dp))
//                        Text(text = "World")
//                        Text(text = "Bye")
//                    }
//                    Row(
//                        modifier = Modifier.fillMaxSize(),
//                        horizontalArrangement = Arrangement.Center,
//                        verticalAlignment = Alignment.Bottom
//                    ) {
//                        Text(text = "Hi")
//                        Text(text = "World")
//                    }
//                    Box (modifier = Modifier.fillMaxWidth(0.5f)){
//                        ImageCard.ImageCardMethod(
//                            painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                            contentDescription = "Playing",
//                            title = "Playing in the snow"
//                        )
//                    }
//                    Column(Modifier.fillMaxSize()) {
//                        val color = remember {
//                            mutableStateOf(Color.Yellow)
//                        }
//                        ColorBox(
//                            Modifier
//                                .fillMaxSize()
//                                .weight(1f)) {
//                            color.value = it
//                        }
//                        Box(
//                            modifier = Modifier
//                                .background(color.value)
//                                .weight(1f)
//                                .fillMaxSize()
//                        ) {
//
//                        }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        val context = LocalContext.current
                        Button(onClick = {
                            val intent = Intent(context, SnackBars::class.java)
                            context.startActivity(intent)
                        }) {
                            Text(text = "Go to Snack Bar Tutorial")
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(onClick = { val intent = Intent(context, ListsInCompose::class.java)
                        context.startActivity(intent)}) {
                            Text(text = "Go to List In Compose tutorial")
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(onClick = { val intent = Intent(context, ConstraintLayoutTutorial::class.java)
                            context.startActivity(intent)}) {
                            Text(text = "Go to Constraint Layout Tutorial")
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RowsAndColumnTheme {
        Greeting("Android")
    }
}