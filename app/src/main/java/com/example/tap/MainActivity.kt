package com.example.tap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tap.ui.theme.TAPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TAPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ButtonWithClickCounter()
                }
            }
        }
    }
}

@Composable
fun ButtonWithClickCounter() {

    var count by remember { mutableStateOf(0)}

    Column(Modifier.fillMaxWidth().fillMaxWidth(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    )
    {

        androidx.compose.material.Text(text = "$count", color = Color.White)

        Button(onClick = {
            count++
        }, shape = RoundedCornerShape(8.dp),
            content = {
                androidx.compose.material.Text(text = "TAP", color = Color.White)
            }
        )
    }


}

