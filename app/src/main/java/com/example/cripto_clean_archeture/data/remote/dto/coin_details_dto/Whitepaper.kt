package com.example.cripto_clean_archeture.data.remote.dto.coin_details_dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Whitepaper(
    @SerialName("link")
    val link: String,
    @SerialName("thumbnail")
    val thumbnail: String
)