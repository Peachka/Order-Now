package com.example.ordernow.data.product

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class ProductRepositoryImpl(
    private val ioDispatcher: CoroutineDispatcher,
    private val productDAO: ProductDAO
): ProductRepository {

    override fun observeAll(): Flow<List<Product>> = productDAO.observeAll()
    override suspend fun getProductById(productId: Int): Product? = withContext(ioDispatcher){
        productDAO.getProductById(productId)
    }

    override suspend fun insert(vararg product: Product) = withContext(ioDispatcher){
        productDAO.insert(*product)
    }

    override suspend fun delete(product: Product) = withContext(ioDispatcher){
        productDAO.delete(product)
    }

    override suspend fun update(product: Product) = withContext(ioDispatcher) {
        productDAO.update(product)
    }


}