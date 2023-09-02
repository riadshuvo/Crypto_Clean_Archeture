package com.example.cripto_clean_archeture.data.remote.dto.coin_details_dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Links(
    @SerialName("explorer")
    val explorer: List<String>,
    @SerialName("facebook")
    val facebook: List<String>,
    @SerialName("reddit")
    val reddit: List<String>,
    @SerialName("source_code")
    val sourceCode: List<String>,
    @SerialName("website")
    val website: List<String>,
    @SerialName("youtube")
    val youtube: List<String>
)