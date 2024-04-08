package com.example.ordernow.ui.product_list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun ProductListScreen(goToProductDetails: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box() {

            Text(text = "Product List Screen")
        }

        Button(
            onClick = goToProductDetails
        ) {
            Text(text = "Go to product details screen")
        }
    }
}