package com.example.cripto_clean_archeture.data.remote.dto.coin_details_dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Stats(
    @SerialName("contributors")
    val contributors: Int,
    @SerialName("followers")
    val followers: Int,
    @SerialName("stars")
    val stars: Int,
    @SerialName("subscribers")
    val subscribers: Int
)