package com.yashagrawal.whatsapp.presentations.callscreen

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
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CallScreen() {
    val callData = listOf(
        CallItemModel(
            image = R.drawable.salman,
            name = "Salman Khan",
            time = "Today, 04:23 PM",
            isMissed = true
        ),
        CallItemModel(
            image = R.drawable.akshay_kumar,
            name = "Akshay Kumar",
            time = "Today, 04:23 PM",
            isMissed = false
        ),
        CallItemModel(
            image = R.drawable.hrithik_roshan,
            name = "Hrithik Roshan",
            time = "Today, 04:23 PM",
            isMissed = true
        ),
        CallItemModel(
            image = R.drawable.carryminati,
            name = "Carry Minati",
            time = "Today, 04:23 PM",
            isMissed = true
        ),
        CallItemModel(
            image = R.drawable.salman,
            name = "Salman Khan",
            time = "Today, 04:23 PM",
            isMissed = false
        ),
        CallItemModel(
            image = R.drawable.akshay_kumar,
            name = "Akshay Kumar",
            time = "Today, 04:23 PM",
            isMissed = true
        ),
        CallItemModel(
            image = R.drawable.hrithik_roshan,
            name = "Hrithik Roshan",
            time = "Today, 04:23 PM",
            isMissed = false
        ),
        CallItemModel(
            image = R.drawable.carryminati,
            name = "Carry Minati",
            time = "Today, 04:23 PM",
            isMissed = true
        ),
    )
    Scaffold(
        bottomBar = {
            BottomNavigation()
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.light_green),
                contentColor = colorResource(R.color.white),
                modifier = Modifier.size(65.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.add_call),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
//                    I am at 9:52
                )
            }
        },
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            TopBar()
            Spacer(modifier = Modifier.height(16.dp))
            FavouriteSection()

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.light_green),
                    contentColor = colorResource(R.color.white)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            ) {
                Text(text = "Start a new call", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Recents Calls",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            LazyColumn {
                items(callData){
                    CallItemDesign(callItemModel = it)
                }
            }
        }
    }
}

@Composable
fun TopBar() {
    var isSearching by remember { mutableStateOf(false) }
    var searchValue by remember { mutableStateOf("") }
    var showMenu by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
    ) {
        Column {
            Row {
                if (isSearching) {
                    TextField(
                        value = searchValue,
                        onValueChange = { searchValue = it },
                        placeholder = { Text(text = "Search") },
                        colors = TextFieldDefaults.colors(
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                        ),
                        modifier = Modifier.padding(start = 12.dp),
                        singleLine = true
                    )
                } else {
                    Text(
                        text = "Call",
                        fontSize = 28.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 12.dp, top = 4.dp)
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                if (isSearching) {
                    IconButton(onClick = {
                        isSearching = false
                        searchValue = ""
                    }) {
                        Icon(imageVector = Icons.Default.Clear, contentDescription = null)
                    }
                } else {
                    IconButton(onClick = { isSearching = true }) {
                        Icon(
                            painter = painterResource(R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { showMenu = true }) {
                        Icon(
                            painter = painterResource(R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                        DropdownMenu(
                            expanded = showMenu,
                            onDismissRequest = { showMenu = false }) {
                            DropdownMenuItem(
                                text = { Text(text = "Settings") },
                                onClick = { showMenu = false })
                        }
                    }

                }
            }
            HorizontalDivider()
        }
    }

}