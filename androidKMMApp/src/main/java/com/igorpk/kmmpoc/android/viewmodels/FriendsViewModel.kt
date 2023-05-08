package com.igorpk.kmmpoc.android.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.igorpk.kmmpoc.android.data.Friend
import com.igorpk.kmmpoc.android.repositories.FriendsRepository
import kotlinx.coroutines.launch

class FriendsViewModel : ViewModel() {

    private val _friendsList: MutableLiveData<List<Friend>> = MutableLiveData()
    val friendList: LiveData<List<Friend>> = _friendsList

    private val repository = FriendsRepository()

    fun fetchFriends() = viewModelScope.launch {
        _friendsList.value = repository.getFriends()
    }
}