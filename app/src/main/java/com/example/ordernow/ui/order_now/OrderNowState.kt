package com.example.ordernow.ui.order_now

import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun rememberAppState(
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    navController: NavHostController = rememberNavController()
    ) = remember(
scaffoldState,
navController
) {
    OrderNowState(scaffoldState, navController)
     }
class OrderNowState(
    val scaffoldState: ScaffoldState,
    val navController: NavHostController,

    )
