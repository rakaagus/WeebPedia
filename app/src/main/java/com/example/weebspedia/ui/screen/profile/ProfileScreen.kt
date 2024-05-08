package com.example.weebspedia.ui.screen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weebspedia.R
import com.example.weebspedia.ui.components.TextInfoProfile

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = painterResource(R.drawable.rakaagus_image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)
                    .padding(horizontal = 24.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
            TextInfoProfile(title = "Nama", value = "Raka Agus Maulana")
            TextInfoProfile(title = "Email", value = "rakhaagus22@gmail.com")
        }
    }
}

@Preview
@Composable
private fun ProfileScreenPrev() {
    ProfileScreen()
}