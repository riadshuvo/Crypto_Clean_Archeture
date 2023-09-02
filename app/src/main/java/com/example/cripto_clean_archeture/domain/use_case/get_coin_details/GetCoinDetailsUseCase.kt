package com.example.cripto_clean_archeture.domain.use_case.get_coin_details

import com.example.cripto_clean_archeture.common.Resource
import com.example.cripto_clean_archeture.data.remote.dto.coin_details_dto.toCoinDetails
import com.example.cripto_clean_archeture.domain.entity.Coin
import com.example.cripto_clean_archeture.domain.entity.CoinDetails
import com.example.cripto_clean_archeture.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinDetailsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetails>> = flow {
        try {
            emit(Resource.Loading())
            val coinDetails = repository.getCoinById(coinId).toCoinDetails()
            emit(Resource.Success(coinDetails))

        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "An unexpected error occured"))

        } catch (e: IOException) {
            emit(Resource.Error(message = "Couldn't reach server. Check your internet connection."))
        }
    }
}