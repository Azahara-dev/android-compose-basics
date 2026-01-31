package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LemonadeApp()
                }
            }
        }
    }
}

@Composable
fun ImageWithButtonAndText(modifier: Modifier = Modifier) {
    var lemonadeState by remember { mutableStateOf(1) }
    var count by remember { mutableStateOf(0) }
    val imagenResource = when (lemonadeState) {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }
    val imagenDescription = when (lemonadeState) {
        1 -> R.string.lemon_tree_content_description
        2 -> R.string.lemon_content_description
        3 -> R.string.glass_lemonade_content_description
        else -> R.string.empty_glass_content_description
    }

    val textResource = when (lemonadeState) {
        1 -> R.string.lemon_tree_text
        2 -> R.string.lemon_text
        3 -> R.string.glass_lemonade_text
        else -> R.string.empty_glass_text
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painterResource(imagenResource),
            contentDescription = stringResource(imagenDescription),
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .background(color = Color(0xFFC2D9B0))
                .clickable {
                    if (lemonadeState == 1) {
                        lemonadeState++
                        count = (2..4).random()
                    } else if (lemonadeState == 2){
                        count--
                        if (count == 0) {
                            lemonadeState++
                        }
                    } else if (lemonadeState == 4) {
                        lemonadeState = 1
                    } else {
                        lemonadeState++
                    }
                }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(textResource),
            fontSize = 18.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LemonadeApp() {
    ImageWithButtonAndText(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

