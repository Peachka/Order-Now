package com.example.ordernow.ui.product_details

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.ordernow.ui.home.HomeScreen
import com.example.ordernow.ui.home.HomeViewModel

@Composable
fun ProductDetails(goBack: () -> Unit) {

    ProductDetailsScreen(goBack)
}
