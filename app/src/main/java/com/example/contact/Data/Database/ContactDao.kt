package com.example.contact.Data.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.contact.Data.entity.Contact
@Dao
interface ContactDao {

    @Insert(onConflict= OnConflictStrategy.REPLACE)
    fun insertContact(contact: Contact)
    @Update
    fun updateContact(contact: Contact)
    @Delete
    fun deleteContact(contact : Contact)
    @Query("SELECT * FROM contacts")
    fun allContact():List<Contact>
}