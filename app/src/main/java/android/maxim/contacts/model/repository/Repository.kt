package android.maxim.contacts.model.repository

import android.database.Cursor
import android.maxim.contacts.model.database.Contact
import android.maxim.contacts.model.database.ContactDao
import android.maxim.contacts.viewmodels.AddViewModel
import android.maxim.contacts.viewmodels.DetailsViewModel
import android.maxim.contacts.viewmodels.EditViewModel
import android.maxim.contacts.viewmodels.ListViewModel
import androidx.lifecycle.LiveData

class Repository(private val contactDao: ContactDao) {

    fun insertContact(contact: Contact) {
        contactDao.insertContact(contact)
    }

    fun updateContact(contact: Contact) {
        contactDao.updateContact(contact)
    }

    fun getContact(): Cursor {
        return contactDao.getContact()
    }

    fun getContactName(): Cursor {
        return contactDao.getContactName()
    }

    fun deleteContact(contact: Contact) {
        contactDao.deleteContact(contact)
    }
}