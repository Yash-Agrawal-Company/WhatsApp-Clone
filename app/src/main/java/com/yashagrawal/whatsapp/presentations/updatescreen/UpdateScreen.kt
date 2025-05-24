package com.yashagrawal.whatsapp.presentations.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yashagrawal.whatsapp.R
import com.yashagrawal.whatsapp.presentations.bottomnavigation.BottomNavigation

@Preview(showSystemUi = true)
@Composable
fun UpdateScreen() {
    val scrollState = rememberScrollState()
    val statusData = listOf<StatusModel>(
        StatusModel(
            image = R.drawable.akshay_kumar,
            name = "Akshay Kumar",
            time = "10:00 AM"
        ),
        StatusModel(
            image = R.drawable.carryminati,
            name = "Carry Minati",
            time = "02:00 AM"
        ),
        StatusModel(
            image = R.drawable.hrithik_roshan,
            name = "Hrithik Roshan",
            time = "10:00 AM"
        ),
    )
    val channelData = listOf(
        ChannelModel(
            image = R.drawable.neat_roots,
            channelName = "Neat Roots",
            description = "Latest news in tech"
        ),
        ChannelModel(
            image = R.drawable.img,
            channelName = "Food Lover",
            description = "Discover new Recipes"
        ),
        ChannelModel(
            image = R.drawable.meta_logo,
            channelName = "Meta",
            description = "Explore the world"
        ),
    )
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_photo_camera_24),
                    contentDescription = null,
                )
            }
        },
        bottomBar = {
            BottomNavigation()
        },

        ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            TopBar()
            Text(
                text = "Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(
                    horizontal = 12.dp,
                    vertical = 8.dp
                )
            )
            MyStatus()

            statusData.forEach {
                StatusItem(statusModel = it)
            }
            Spacer(modifier = Modifier.height(12.dp))
            HorizontalDivider(color = Color.Gray)
            Text(
                text = "Channels",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(
                    horizontal = 12.dp,
                    vertical = 8.dp
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Column (modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(
                    text = "Stay updated on topics that matter to you. Find Channels to follow below"
                )
                Spacer(modifier = Modifier.height(32.dp))
                Text(text = "Find Channels to follow")
            }
            Spacer(modifier = Modifier.height(16.dp))
            channelData.forEach {
                ChannelItemDesign(channelModel = it)
            }
        }
    }
}