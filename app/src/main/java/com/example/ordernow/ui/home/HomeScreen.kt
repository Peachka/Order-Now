package com.example.ordernow.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun HomeScreen(goToProductList: () -> Unit){
    Column(modifier =  Modifier.fillMaxSize()){
        Box(){

            Text(text = "Home")
        }
        
        Button(
            onClick =  goToProductList) {
            Text(text = "Go to product list")
        }
    }
}