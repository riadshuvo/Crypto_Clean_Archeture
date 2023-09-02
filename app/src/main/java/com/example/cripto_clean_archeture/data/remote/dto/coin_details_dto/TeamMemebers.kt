package com.example.cripto_clean_archeture.data.remote.dto.coin_details_dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamMemebers(
    @SerialName("id")
    val id: String,
    @SerialName("name")
    val name: String,
    @SerialName("position")
    val position: String
)