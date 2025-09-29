package com.example.tapelelapin

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.tapelelapin.ui.theme.TapeLeLapinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TapeLeLapinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier= modifier.fillMaxHeight(0.1F).fillMaxWidth().background(Color.Magenta)) {

        Text(
            text = "TapeLeLapin",
            modifier = modifier,
            fontSize = 4.em,
            color = Color.Green,
        )

    }
        Column(

            modifier= modifier.fillMaxHeight(0.9F).fillMaxWidth().padding(15.dp)
        ) {
            Row {
                Text(
                    text = "0 pafs",
                    modifier = modifier.fillMaxHeight(0.1f).padding(30.dp),
                    fontSize = 4.em,
                    color = Color.Green,

                    )
                Text(
                    text = "0 pafs",
                    modifier = modifier.fillMaxHeight(0.1f).padding(30.dp),
                    fontSize = 4.em,
                    color = Color.Red,

                    )
            }

        }
    }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TapeLeLapinTheme {
        Greeting("Android")
    }
}