package com.example.contact.Data

import com.example.contact.Data.Database.ContactDao
import com.example.contact.Data.entity.Contact

class Repository (private val contactDao: ContactDao){
    fun insertContact(contact: Contact)= contactDao.insertContact(contact)
    fun deleteContact(contact:Contact)=contactDao.deleteContact(contact)
    fun getAllContact():List<Contact> = contactDao.allContact()

}