package com.example.cripto_clean_archeture.domain.use_case.get_coins

import com.example.cripto_clean_archeture.common.Resource
import com.example.cripto_clean_archeture.data.remote.dto.coins_dto.toCoin
import com.example.cripto_clean_archeture.domain.entity.Coin
import com.example.cripto_clean_archeture.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))

        }catch (e: HttpException){
            emit(Resource.Error<List<Coin>>(message = e.localizedMessage ?: "An unexpected error occured"))

        }catch (e: IOException){
            emit(Resource.Error<List<Coin>>(message = "Couldn't reach server. Check your internet connection."))
        }
    }
}