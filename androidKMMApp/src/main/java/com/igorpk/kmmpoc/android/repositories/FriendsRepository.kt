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
                phoneNumber = "5534999990000",
                pictureURL = "https://i.pinimg.com/originals/25/24/7c/25247cb2dd5a22a4aa1a36603aedc151.jpg"
            ),
            Friend(
                name = "Phoebe",
                phoneNumber = "5534999990000",
                pictureURL = "https://media.licdn.com/dms/image/C4E03AQFlHjJML_priQ/profile-displayphoto-shrink_800_800/0/1630605930644?e=2147483647&v=beta&t=9zDVXtFjbIMBkbyOoSKbnBw8Il2xs97esEGxZj1lp5Q"
            ),
            Friend(
                name = "Monica",
                phoneNumber = "5534999990000",
                pictureURL = "https://criticalhits.com.br/wp-content/uploads/2021/03/monica_geller_1.jpg"
            ),
            Friend(
                name = "Ross",
                phoneNumber = "5534999990000",
                pictureURL = "https://cinepop.com.br/wp-content/uploads/2019/09/ross_geller_friends_.jpg"
            ),
            Friend(
                name = "Joey",
                phoneNumber = "5534999990000",
                pictureURL = "https://espalhafactos.com/wp-content/uploads/2020/07/540599ec-b13a-428c-8075-6f15bda099d6-joey-tribbianni-best-pickup-lines-770x481.png"
            ),
            Friend(
                name = "Chandler",
                phoneNumber = "5534999990000",
                pictureURL = "https://pyxis.nymag.com/v1/imgs/079/792/3ed0d94be0a9bd3d023f00532889bab152-30-chandler-bing.rsquare.w330.jpg"
            )
        )
    }

}