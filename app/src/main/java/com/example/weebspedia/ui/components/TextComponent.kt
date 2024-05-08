package com.example.weebspedia.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.ChipBorder
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextInfoProfile(
    title: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 15.dp),
    ) {
        Text(
            text = title + ": ",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.titleMedium.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        )
        Text(
            text = value,
            style = MaterialTheme.typography.titleMedium.copy(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            ),
            color = Color.Black
        )
    }
}

@Composable
fun SectionText(title: String, content: @Composable () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(top = 20.dp)) {
        Text(text = title, modifier = Modifier.padding(horizontal = 12.dp))
        content()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GenreTextButton(
    genreId: Int,
    name: String,
    clickToGenreScreen: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    FilterChip(
        onClick = { clickToGenreScreen(genreId) },
        label = {
            Text(text = name)
        },
        shape = RoundedCornerShape(
            topStart = 8.dp,
            topEnd = 8.dp,
            bottomEnd = 8.dp,
            bottomStart = 4.dp
        ),
        selected = true,
        modifier = modifier.height(35.dp)
    )
}