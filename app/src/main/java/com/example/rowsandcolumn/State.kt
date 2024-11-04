package com.example.rowsandcolumn

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class State {

    companion object {
        @Composable
        fun ColorBox(modifier: Modifier = Modifier, updateColor: (Color) -> Unit) {


            Box(
                modifier = modifier
                    .background(Color.Red)
                    .clickable {
                        updateColor(
                            Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f)
                        )
                    }) {

            }
        }

    }
}