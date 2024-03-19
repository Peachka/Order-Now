package com.example.ordernow.data

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = [Product::class], version = 1)
abstract class RoomProductsDatabase: RoomDatabase(){

}