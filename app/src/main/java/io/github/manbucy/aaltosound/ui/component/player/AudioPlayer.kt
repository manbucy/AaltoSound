package io.github.manbucy.aaltosound.ui.component.player

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.manbucy.aaltosound.R
import io.github.manbucy.aaltosound.model.AudioInfo

@Composable
fun BottomAudioPlayer(audioInfo: AudioInfo) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .border(width = 0.1.dp, color = Color.Black)
            .width(375.dp)
            .height(66.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.tmp_album_cover),
            contentDescription = "This is audio cover",
            modifier = Modifier.size(66.dp)
        )

        Column(
            modifier = Modifier
                .padding(start = 12.dp, end = 8.dp)
                .weight(1f)
        ) {
            Text(
                text = audioInfo.name, fontSize = 17.sp,
                maxLines = 1, overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Text(
                text = audioInfo.author, fontSize = 10.sp,
                maxLines = 1, overflow = TextOverflow.Ellipsis,
            )
        }


        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(end = 16.dp)
        ) {
            val iconButtonSize = 38.dp
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(iconButtonSize)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_play_control_previous),
                    contentDescription = "This is previous button",
                    modifier = Modifier
                        .size(22.dp)
                )
            }
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(iconButtonSize)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_play_control_pause),
                    contentDescription = "This is pause button",
                    modifier = Modifier
                        .size(26.dp)
                )
            }
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(iconButtonSize)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_play_control_next),
                    contentDescription = "This is next button",
                    modifier = Modifier
                        .size(22.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    BottomAudioPlayer(
        AudioInfo("", "Chaff & Dust Chaff & Dust Chaff & Dust Chaff & Dust Chaff & Dust", "HYONNA")
    )
}

