package com.example.ordernow.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ordernow.ui.cart.Cart
import com.example.ordernow.ui.home.Home
import com.example.ordernow.ui.order_now.OrderNowState
import com.example.ordernow.ui.product_details.ProductDetails
import com.example.ordernow.ui.product_list.ProductList

@Composable
fun OrderNowNavHost(appState: OrderNowState, paddingValues: PaddingValues) {
    NavHost(
        navController = appState.navController,
        startDestination = OrderNowScreenRoute.Home.route,
        modifier = androidx.compose.ui.Modifier.padding(paddingValues)
    ) {
        appSoGraph(appState)
    }
}

fun NavGraphBuilder.appSoGraph(appState: OrderNowState) {

    val homeRoute = OrderNowScreenRoute.Home.route
    val listRoute = OrderNowScreenRoute.ProductList.route
    val detailRoute = OrderNowScreenRoute.ProductDetail.route

    val goToListFromHome: () -> Unit = {
        appState.navigateSaved(listRoute, homeRoute)
    }

    val goToDetailsFromList: () -> Unit = {
        appState.navigateSaved(detailRoute, listRoute)
    }

    val goBack: () -> Unit = {
        appState.popUp()
    }
    // Home Screen Graph
    composable(NavigationBarSection.Home.route) {
        Home(goToProductList = goToListFromHome)
    }

    // Cart Screen Graph
    composable(NavigationBarSection.Cart.route) {
        Cart()
    }

    // Product List Screen Graph
    composable(OrderNowScreenRoute.ProductList.route) {
        ProductList(goToProductDetails = goToDetailsFromList)
    }

    // Product Detail Screen Graph
    composable(OrderNowScreenRoute.ProductDetail.route) {
        ProductDetails(goBack = goBack)
    }
}
