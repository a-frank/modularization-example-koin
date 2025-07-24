package com.photoroom.modularize

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.photoroom.design.ModularizeTheme
import com.photoroom.feature.user.USER_GRAPH
import com.photoroom.feature.user.attachUserGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ModularizeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        rememberNavController(),
                        USER_GRAPH,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        attachUserGraph()
                    }
                }
            }
        }
    }
}
