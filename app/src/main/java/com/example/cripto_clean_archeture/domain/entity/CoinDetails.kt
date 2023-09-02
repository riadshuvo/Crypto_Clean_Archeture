package com.example.cripto_clean_archeture.domain.entity

import com.example.cripto_clean_archeture.data.remote.dto.coin_details_dto.TeamMemebers

data class CoinDetails(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMemebers>
)
