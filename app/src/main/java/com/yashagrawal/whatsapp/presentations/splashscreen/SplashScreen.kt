package com.yashagrawal.whatsapp.presentations.splashscreen

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yashagrawal.whatsapp.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Icon(
            painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .size(85.dp)
                .align(Alignment.Center),
            tint = colorResource(R.color.light_green)
        )
        Column(modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 30.dp)) {
            Text(
                text = "From",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.meta_logo),
                    modifier = Modifier.size(30.dp),
                    contentDescription = null,
                    tint = colorResource(R.color.light_green)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "Meta",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.light_green)
                )

            }
        }
    }
//        I am at 26:52
}