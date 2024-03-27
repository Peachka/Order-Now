package com.example.ordernow.data.product

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDAO {

    @Query("SELECT * FROM product")
    fun observeAll(): Flow<List<Product>>

    @Query("SELECT * FROM product WHERE id= :productId")
    fun getProductById( productId: Int): Product?

    @Insert
    fun insert(vararg product: Product)

    @Delete
    fun delete(product: Product)

    @Update
    fun update(product: Product)

}