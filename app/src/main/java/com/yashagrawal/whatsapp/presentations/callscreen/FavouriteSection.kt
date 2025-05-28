package com.yashagrawal.whatsapp.presentations.callscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yashagrawal.whatsapp.R


@Composable
fun FavouriteItemDesign(favouriteModel: FavouriteModel) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(start = 4.dp, top = 4.dp, end = 12.dp)
        ) {
        Image(
            painter = painterResource(id = favouriteModel.image),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = favouriteModel.name, fontSize = 14.sp, fontWeight = FontWeight.Medium)
    }
}

@Preview(showSystemUi = true)
@Composable
fun FavouriteSection() {
    val favouriteData = listOf(
        FavouriteModel(R.drawable.salman,"Salman Khan"),
        FavouriteModel(R.drawable.akshay_kumar,"Akshay Kumar"),
        FavouriteModel(R.drawable.hrithik_roshan,"Hrithik Roshan"),
        FavouriteModel(R.drawable.carryminati,"Carry Minati"),
        FavouriteModel(R.drawable.salman,"Salman Khan"),
        FavouriteModel(R.drawable.akshay_kumar,"Akshay Kumar"),
        FavouriteModel(R.drawable.hrithik_roshan,"Hrithik Roshan"),
        FavouriteModel(R.drawable.carryminati,"Carry Minati"),
    )
    Column (modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)){
        Text(text = "Favourites", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 8.dp))
        Row(modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState())){
            favouriteData.forEach {
                FavouriteItemDesign(favouriteModel = it)
            }
        }
    }
}

data class FavouriteModel(val image : Int,val name : String)