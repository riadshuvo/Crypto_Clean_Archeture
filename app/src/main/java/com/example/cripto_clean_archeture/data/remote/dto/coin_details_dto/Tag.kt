package com.example.cripto_clean_archeture.data.remote.dto.coin_details_dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Tag(
    @SerialName("coin_counter")
    val coinCounter: Int,
    @SerialName("ico_counter")
    val icoCounter: Int,
    @SerialName("id")
    val id: String,
    @SerialName("name")
    val name: String
)