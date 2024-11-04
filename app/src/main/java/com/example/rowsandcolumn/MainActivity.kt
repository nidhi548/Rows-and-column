package com.example.rowsandcolumn

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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    Column(
                        modifier = Modifier
                            .background(Color.Green)
                            .fillMaxSize()
                            .width(600.dp)
//                            .requiredWidth(600.dp)
                            .border(5.dp, Color.Magenta)
                            .padding(16.dp)
                            .border(5.dp, Color.Blue)
                            .padding(16.dp)
                            .border(5.dp, Color.Red)
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        Text(
                            text = "Hi",
//                            modifier = Modifier.offset(50.dp, 20.dp)
                        )
                        Spacer(modifier = Modifier.height(50.dp))
                        Text(text = "World")
                        Text(text = "Bye")
                    }
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.Bottom
                    ) {
                        Text(text = "Hi")
                        Text(text = "World")
                    }
                    Box (modifier = Modifier.fillMaxWidth(0.5f)){
                        ImageCard.ImageCardMethod(
                            painter = painterResource(id = R.drawable.ic_launcher_foreground),
                            contentDescription = "Playing",
                            title = "Playing in the snow"
                        )
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