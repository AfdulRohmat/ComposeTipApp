package com.example.composetipapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetipapp.ui.theme.ComposeTipAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                Text(text = "Hello")
            }

        }
    }
}

// CONTAINER MAIN APP
@Composable
fun MyApp(content: @Composable () -> Unit) {

    ComposeTipAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            content()
        }

    }

}

@Preview()
@Composable
fun TopHeader() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clip(shape = RoundedCornerShape(16.dp)),
        color = Color(0xFFE9D7F7)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Total Per Person",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 21.sp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "$40.000",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 40.sp)
            )

        }
    }
}


//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ComposeTipAppTheme {
        // A surface container using the 'background' color from the theme
        MyApp {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TopHeader()
            }
        }

    }
}