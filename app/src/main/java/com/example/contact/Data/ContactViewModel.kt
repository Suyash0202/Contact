package com.example.contact.Data

import androidx.lifecycle.ViewModel
import com.example.contact.Data.entity.Contact
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

class ContactViewModel @Inject constructor(val repository: Repository): ViewModel() {

    private var _state = MutableStateFlow<AppState>(AppState())



}

 class AppState(
    var loading : Boolean=false,
            var allContacts : List<Contact> = emptyList<Contact>(),
                    var error : String=""

 )