package com.example.cripto_clean_archeture.presentation.coin_list.state

import com.example.cripto_clean_archeture.domain.entity.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
