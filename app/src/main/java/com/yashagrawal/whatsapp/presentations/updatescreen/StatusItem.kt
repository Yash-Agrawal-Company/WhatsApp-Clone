package com.yashagrawal.whatsapp.presentations.updatescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yashagrawal.whatsapp.R


@Composable
fun MyStatus() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box() {

            Image(
                painter = painterResource(R.drawable.my_image),
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .size(25.dp)
                    .align(Alignment.BottomEnd),

                ) {
                Icon(
                    imageVector = Icons.Default.AddCircle, // Solid circle background
                    contentDescription = null,
                    tint = colorResource(R.color.light_green),
                    modifier = Modifier.matchParentSize()
                )
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = colorResource(R.color.white),
                    modifier = Modifier.matchParentSize()
                )
            }

        }
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(text = "My status", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Text(text = "Tap to add status update", color = Color.Gray, fontSize = 14.sp)
        }
    }
}
data class StatusModel(val image : Int, val name : String, val time : String)
@Composable
fun StatusItem(statusModel: StatusModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = statusModel.image),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .padding(4.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(text = statusModel.name, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Text(text = statusModel.time, color = Color.Gray, fontSize = 14.sp)
        }

    }
}