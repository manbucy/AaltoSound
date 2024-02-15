package io.github.manbucy.aaltosound

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.manbucy.aaltosound.model.AudioInfo
import io.github.manbucy.aaltosound.ui.component.player.BottomAudioPlayer
import io.github.manbucy.aaltosound.ui.theme.AaltoSoundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AaltoSoundTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    BottomAudioPlayer(
                        AudioInfo("", "Chaff & Dust Chaff & Dust Chaff & Dust Chaff & Dust Chaff & Dust", "HYONNA")
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AaltoSoundTheme {
        BottomAudioPlayer(
            AudioInfo("", "Chaff & Dust Chaff & Dust Chaff & Dust Chaff & Dust Chaff & Dust", "HYONNA")
        )
    }
}