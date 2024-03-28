package com.example.ordernow.ui.home

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun Home(viewModel: HomeViewModel = hiltViewModel()) {

    HomeScreen()
}