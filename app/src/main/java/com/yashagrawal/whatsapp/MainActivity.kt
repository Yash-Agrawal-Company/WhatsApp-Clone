package com.yashagrawal.whatsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yashagrawal.whatsapp.presentations.communitiesscreen.CommunitiesScreen
import com.yashagrawal.whatsapp.presentations.homescreen.HomeScreen
import com.yashagrawal.whatsapp.presentations.splashscreen.SplashScreen
import com.yashagrawal.whatsapp.presentations.userregistrationscreen.UserRegistrationScreen
import com.yashagrawal.whatsapp.presentations.welcomescreen.WelcomeScreen
import com.yashagrawal.whatsapp.ui.theme.WhatsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WhatsAppTheme {
                CommunitiesScreen()
                }
            }
        }
    }


