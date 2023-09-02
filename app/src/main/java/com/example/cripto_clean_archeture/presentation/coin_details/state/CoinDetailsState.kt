package com.example.cripto_clean_archeture.presentation.coin_details.state

import com.example.cripto_clean_archeture.domain.entity.CoinDetails

data class CoinDetailsState(
val isLoading: Boolean = false,
val coin: CoinDetails? = null,
val error: String = ""
)

