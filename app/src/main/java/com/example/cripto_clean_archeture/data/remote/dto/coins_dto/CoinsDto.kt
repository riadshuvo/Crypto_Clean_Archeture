package com.example.cripto_clean_archeture.data.remote.dto.coins_dto


import com.example.cripto_clean_archeture.domain.entity.Coin
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinsDto(
    @SerialName("id")
    val id: String,
    @SerialName("is_active")
    val isActive: Boolean,
    @SerialName("is_new")
    val isNew: Boolean,
    @SerialName("name")
    val name: String,
    @SerialName("rank")
    val rank: Int,
    @SerialName("symbol")
    val symbol: String,
    @SerialName("type")
    val type: String
)

fun CoinsDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol,
    )
}