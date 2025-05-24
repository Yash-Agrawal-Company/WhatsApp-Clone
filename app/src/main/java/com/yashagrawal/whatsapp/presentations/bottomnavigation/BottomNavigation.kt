package com.yashagrawal.whatsapp.presentations.bottomnavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yashagrawal.whatsapp.R

@Preview(showSystemUi = true)
@Composable
fun BottomNavigation(){
    BottomAppBar (tonalElevation = 12.dp, containerColor = Color.White) {
        Row (modifier = Modifier.fillMaxWidth().padding(14.dp) , horizontalArrangement = Arrangement.SpaceBetween , verticalAlignment = Alignment.CenterVertically) {
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(painter = painterResource(R.drawable.chats), contentDescription = null, modifier = Modifier.size(28.dp))
                Spacer(modifier = Modifier.height(3.dp))
                Text(text = "Chats", fontWeight = FontWeight.Bold)
            }
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(painter = painterResource(R.drawable.update_icon), contentDescription = null, modifier = Modifier.size(28.dp))
                Spacer(modifier = Modifier.height(3.dp))
                Text(text = "Updates", fontWeight = FontWeight.Bold)
            }
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(painter = painterResource(R.drawable.communities_icon), contentDescription = null, modifier = Modifier.size(28.dp))
                Spacer(modifier = Modifier.height(3.dp))
                Text(text = "Communities", fontWeight = FontWeight.Bold)
            }
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(imageVector = Icons.Default.Call, contentDescription = null, modifier = Modifier.size(28.dp))
                Spacer(modifier = Modifier.height(3.dp))
                Text(text = "Calls", fontWeight = FontWeight.Bold)
            }

        }
    }
}