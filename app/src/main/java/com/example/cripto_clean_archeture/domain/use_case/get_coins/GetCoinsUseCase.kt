package com.example.cripto_clean_archeture.domain.use_case.get_coins

import com.example.cripto_clean_archeture.common.Resource
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

        }catch (e: HttpException){

        }catch (e: IOException){

        }
    }
}