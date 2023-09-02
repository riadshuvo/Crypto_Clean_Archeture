package com.example.cripto_clean_archeture.presentation.coin_details.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cripto_clean_archeture.common.Constants
import com.example.cripto_clean_archeture.common.Resource
import com.example.cripto_clean_archeture.domain.use_case.get_coin_details.GetCoinDetailsUseCase
import com.example.cripto_clean_archeture.presentation.coin_details.state.CoinDetailsState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinDetailsViewModel @Inject constructor(
    private val getCoinDetailsUseCase: GetCoinDetailsUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = mutableStateOf(CoinDetailsState())
    val state: State<CoinDetailsState> = _state

    init {
        savedStateHandle.get<String>(Constants.PARAM_COIN_ID)?.let { coinId ->
            getCoinDetails(coinId)
        }
    }

    private fun getCoinDetails(coinId: String) {
        getCoinDetailsUseCase(coinId).onEach { result ->
            when (result) {
                is Resource.Error -> {
                    _state.value = CoinDetailsState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Success -> {
                    _state.value = CoinDetailsState(coin = result.data)
                }

                is Resource.Loading -> {
                    _state.value = CoinDetailsState(isLoading = true)
                }
            }

        }.launchIn(viewModelScope)
    }

}