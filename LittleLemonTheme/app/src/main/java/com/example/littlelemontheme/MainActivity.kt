package com.example.littlelemontheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.littlelemontheme.ui.theme.LittleLemonThemeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonThemeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

var visible by remember {
    mutableStateOf(true)
}
Column {
    AnimatedVisibility(visible = visible, enter = fadeIn(), exit = fadeOut()) {
        Text(text = "Hello, world!")
    }
    Button(onClick = { visible = !visible}) {
        Text("Button")
        
    }
}

@Composable
fun Greeting(name: String) {
    Button(onClick = { /*TODO*/ }, Modifier.wrapContentSize()) {
        Text(text = "Order")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LittleLemonThemeTheme {
        Greeting("Android")
    }
}