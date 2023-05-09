package com.igorpk.kmmpoc.android.repositories

import com.igorpk.kmmpoc.android.data.Friend
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class FriendsRepository {

    suspend fun getFriends(): List<Friend> = withContext(Dispatchers.IO) {
        delay(1000)
        listOf(
            Friend(
                name = "Rachel",
                phoneNumber = "+55 (34) 99999-0000"
            ),
            Friend(
                name = "Phoebe",
                phoneNumber = "+55 (34) 99999-0000"
            ),
            Friend(
                name = "Monica",
                phoneNumber = "+55 (34) 99999-0000"
            ),
            Friend(
                name = "Ross",
                phoneNumber = "+55 (34) 99999-0000"
            ),
            Friend(
                name = "Joey",
                phoneNumber = "+55 (34) 99999-0000"
            ),
            Friend(
                name = "Chandler",
                phoneNumber = "+55 (34) 99999-0000"
            ),
            Friend(
                name = "Gunther",
                phoneNumber = "+55 (34) 99999-0000"
            ),
            Friend(
                name = "Janice",
                phoneNumber = "+55 (34) 99999-0000"
            ),
            Friend(
                name = "Ben",
                phoneNumber = "+55 (34) 99999-0000"
            ),
            Friend(
                name = "Judy",
                phoneNumber = "+55 (34) 99999-0000"
            ),
            Friend(
                name = "Brad",
                phoneNumber = "+55 (34) 99999-0000"
            )
        )
    }

}