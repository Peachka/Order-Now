package com.example.ordernow.ui.order_now

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.ordernow.navigation.OrderNowNavHost
import com.example.ordernow.ui.patterns.OrderNowBottomBar
import com.example.ordernow.ui.patterns.OrderNowTopBar

@Composable
fun OrderNowScreen(appState: OrderNowState) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
                 ) {
        Scaffold(
            scaffoldState = appState.scaffoldState,
                topBar = { OrderNowTopBar() },
        bottomBar = { OrderNowBottomBar(appState.navController) }
        ) { contentPadding ->
            OrderNowNavHost(appState, contentPadding)
        }
    }
}