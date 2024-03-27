package com.example.ordernow.data.product


import kotlinx.coroutines.flow.Flow

interface ProductRepository {
    fun observeAll(): Flow<List<Product>>
    suspend fun getProductById( productId: Int): Product?
    suspend fun insert(vararg product: Product)
    suspend fun delete(product: Product)
    suspend fun update(product: Product)
}