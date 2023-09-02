package com.example.cripto_clean_archeture.domain.repository

import com.example.cripto_clean_archeture.data.remote.dto.coin_details_dto.CoinDetailsDto
import com.example.cripto_clean_archeture.data.remote.dto.coins_dto.CoinsDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinsDto>

    suspend fun getCoinById(coinId: String): CoinDetailsDto
}