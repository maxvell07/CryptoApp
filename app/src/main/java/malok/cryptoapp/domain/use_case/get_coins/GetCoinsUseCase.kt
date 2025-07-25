package malok.cryptoapp.domain.use_case.get_coins

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import malok.cryptoapp.data.remote.dto.mapTOCoin
import malok.cryptoapp.domain.model.Coin
import malok.cryptoapp.domain.repository.CoinRepository
import malok.cryptocurrencyapp.common.Resource
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
){
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
           emit(Resource.Loading())
           val coins = repository.getCoins().map { it.mapTOCoin() }
           emit(Resource.Success(coins))
        }catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage?:"An unexaption error"))
        } catch (e: IOException){
            emit(Resource.Error("Couldnt reach server."))
        }
    }
}
