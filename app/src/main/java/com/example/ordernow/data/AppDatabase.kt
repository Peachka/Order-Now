package com.example.ordernow.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ordernow.data.product.Product
import com.example.ordernow.data.product.ProductDAO

@Database(entities = [Product::class], version = 1)
abstract class AppDatabase: RoomDatabase(){
    abstract fun productDAO(): ProductDAO

}