package com.example.contact.Data.Database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.contact.Data.entity.Contact

@Database(entities =[Contact::class], version = 1, exportSchema = true)
abstract class ContactDatabase: RoomDatabase() {
    abstract var contactDao: ContactDao
    companion object {

    }
}