package com.example.cripto_clean_archeture.data.remote.api

import com.example.cripto_clean_archeture.common.Constants
import com.example.cripto_clean_archeture.data.remote.dto.coin_details_dto.CoinDetailsDto
import com.example.cripto_clean_archeture.data.remote.dto.coins_dto.CoinsDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinsDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String) : CoinDetailsDto
}