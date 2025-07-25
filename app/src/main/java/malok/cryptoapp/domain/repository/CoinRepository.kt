package malok.cryptoapp.domain.repository

import malok.cryptoapp.data.remote.dto.CoinDetailDto
import malok.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}