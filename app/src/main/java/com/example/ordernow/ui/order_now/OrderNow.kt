package com.example.ordernow.ui.order_now

import androidx.compose.runtime.Composable

@Composable
fun OrderNow() {
    val appState = rememberAppState()

    OrderNowScreen(appState)
}