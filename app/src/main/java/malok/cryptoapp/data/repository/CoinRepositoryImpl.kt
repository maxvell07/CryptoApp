package malok.cryptoapp.data.repository

import malok.cryptoapp.data.remote.dto.CoinDetailDto
import malok.cryptoapp.data.remote.dto.CoinDto
import malok.cryptoapp.domain.repository.CoinRepository
import malok.cryptocurrencyapp.data.remote.dto.CryptoApi
import javax.inject.Inject

class CoinRepositoryImpl  @Inject constructor(
    private val api: CryptoApi
): CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
    return api.getCoinById(coinId)
    }
}