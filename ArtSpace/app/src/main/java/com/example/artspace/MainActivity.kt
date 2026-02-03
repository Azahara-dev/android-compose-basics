package com.example.artspace

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.BrushPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ArtSpaceApp()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        var actualArt by remember { mutableStateOf(1) }

        Spacer(modifier = Modifier.weight(1f))

        when (actualArt) {
            1 -> {
                ArtWall(
                    painterResource(R.drawable.los_girasoles)
                )
                Spacer(modifier = Modifier.weight(1f))
                ArtDescription(
                    stringResource(R.string.van_goh_art),
                    stringResource(R.string.van_goh)
                )
            }

            2 -> {
                ArtWall(
                    painterResource(R.drawable.la_dama_del_arminio)
                )
                Spacer(modifier = Modifier.weight(1f))
                ArtDescription(
                    stringResource(R.string.leonardo_da_vinci_art),
                    stringResource(R.string.leonardo_da_vinci)
                )
            }

            3 -> {
                ArtWall(
                    painterResource(R.drawable.mujer_con_sombrilla)
                )
                Spacer(modifier = Modifier.weight(1f))
                ArtDescription(
                    stringResource(R.string.claude_monet_art),
                    stringResource(R.string.claude_monet)
                )
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        RowButtons(
            onPrevious = {
                if (actualArt == 1) {
                    actualArt = 3
                } else {
                    actualArt--
                }
            },
            onNext = {
                if (actualArt == 3) {
                    actualArt = 1
                } else {
                    actualArt++
                }
            }
        )
    }
}

@Composable
fun ArtWall(art: Painter) {
    Image(
        painter = art,
        contentDescription = null,
        modifier = Modifier
            .shadow(elevation = 8.dp, RoundedCornerShape(24.dp))
            .clip(RoundedCornerShape(24.dp))
            .border(width = 4.dp, color = Color.Gray, shape = RoundedCornerShape(24.dp))
        //.size(260.dp)
    )
}

@Composable
fun ArtDescription(title: String, artist: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )
        Text(
            text = artist,
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

@Composable
fun RowButtons(
    onPrevious: () -> Unit,
    onNext: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth()
    ) {
        RoundedButton("Previous", onPrevious)
        RoundedButton("Next", onNext)
    }
}

@Composable
fun RoundedButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(50),
        modifier = Modifier.width(140.dp)
    ) {
        Text(text)
    }
}

@Preview(showBackground = true)
@Composable
fun ArtSpaceAppPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}