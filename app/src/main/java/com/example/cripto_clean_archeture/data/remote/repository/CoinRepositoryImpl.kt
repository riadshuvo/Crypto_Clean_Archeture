package com.example.cripto_clean_archeture.data.remote.repository

import com.example.cripto_clean_archeture.data.remote.api.CoinPaprikaApi
import com.example.cripto_clean_archeture.data.remote.dto.coin_details_dto.CoinDetailsDto
import com.example.cripto_clean_archeture.data.remote.dto.coins_dto.CoinsDto
import com.example.cripto_clean_archeture.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi,
): CoinRepository {
    override suspend fun getCoins(): List<CoinsDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailsDto {
        return api.getCoinById(coinId)
    }
}