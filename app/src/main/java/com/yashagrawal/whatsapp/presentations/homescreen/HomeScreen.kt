package com.yashagrawal.whatsapp.presentations.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yashagrawal.whatsapp.R
import com.yashagrawal.whatsapp.presentations.bottomnavigation.BottomNavigation

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {

    val chatData = listOf<ChatDesignModel>(
        ChatDesignModel(
            image = R.drawable.salman,
            name = "Salman Khan",
            time = "10:00 AM",
            message = "Hello"
        ),
        ChatDesignModel(
            image = R.drawable.sharukh_khan,
            name = "Sharukh Khan",
            time = "02:00 AM",
            message = "hiee!"
        ),
        ChatDesignModel(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha Kapoor",
            time = "12:33 PM",
            message = "HEY!"
        ),
        ChatDesignModel(
            image = R.drawable.salman,
            name = "Salman Khan",
            time = "10:00 AM",
            message = "Hello"
        ),
        ChatDesignModel(
            image = R.drawable.salman,
            name = "Salman Khan",
            time = "10:00 AM",
            message = "Hello"
        ),
        ChatDesignModel(
            image = R.drawable.sharukh_khan,
            name = "Sharukh Khan",
            time = "02:00 AM",
            message = "hiee!"
        ),
        ChatDesignModel(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha Kapoor",
            time = "12:33 PM",
            message = "HEY!"
        ),
        ChatDesignModel(
            image = R.drawable.salman,
            name = "Salman Khan",
            time = "10:00 AM",
            message = "Hello"
        ),

        ChatDesignModel(
            image = R.drawable.salman,
            name = "Salman Khan",
            time = "10:00 AM",
            message = "Hello"
        ),
        ChatDesignModel(
            image = R.drawable.sharukh_khan,
            name = "Sharukh Khan",
            time = "02:00 AM",
            message = "hiee!"
        ),
        ChatDesignModel(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha Kapoor",
            time = "12:33 PM",
            message = "HEY!"
        ),
        ChatDesignModel(
            image = R.drawable.salman,
            name = "Salman Khan",
            time = "10:00 AM",
            message = "Hello"
        ),
        ChatDesignModel(
            image = R.drawable.salman,
            name = "Salman Khan",
            time = "10:00 AM",
            message = "Hello"
        ),
        ChatDesignModel(
            image = R.drawable.sharukh_khan,
            name = "Sharukh Khan",
            time = "02:00 AM",
            message = "hiee!"
        ),
        ChatDesignModel(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha Kapoor",
            time = "12:33 PM",
            message = "HEY!"
        ),
        ChatDesignModel(
            image = R.drawable.salman,
            name = "Salman Khan",
            time = "10:00 AM",
            message = "Hello"
        ),



    )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.light_green),
                contentColor = colorResource(R.color.white),
                modifier = Modifier.size(65.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.add_chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
//                    I am at 9:52
                )
            }
        },
        bottomBar = {
            BottomNavigation()
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding))   {
            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier.fillMaxWidth()){
                Text(
                    text = "WhatsApp",
                    fontSize = 28.sp,
                    color = colorResource(R.color.light_green),
                    modifier = Modifier.align(Alignment.CenterStart).padding(16.dp),
                    fontWeight = FontWeight.Bold
                )
                Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                    IconButton(onClick = {}) {
                        Icon(painter = painterResource(R.drawable.camera), contentDescription = null, modifier = Modifier.size(24.dp))
                    }
                    IconButton(onClick = {}) {
                        Icon(painter = painterResource(R.drawable.search), contentDescription = null, modifier = Modifier.size(24.dp))
                    }
                    IconButton(onClick = {}) {
                        Icon(painter = painterResource(R.drawable.more), contentDescription = null, modifier = Modifier.size(24.dp))
                    }
                }
            }
            HorizontalDivider()
            LazyColumn {
                items(chatData){
                    ChatDesign(chatDesignModel = it)
                }
            }
        }
    }
}