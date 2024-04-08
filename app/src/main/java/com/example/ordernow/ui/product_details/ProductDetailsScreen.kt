package com.example.ordernow.ui.product_details

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun ProductDetailsScreen(goBack: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box() {

            Text(text = "Product Details Screen")
        }

        Button(
            onClick = goBack
        ) {
            Text(text = "Go Back to product list")
        }
    }
}