package malok.cryptoapp.domain.use_case.get_coin

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import malok.cryptoapp.data.remote.dto.mapToCoinDetail
import malok.cryptoapp.domain.model.CoinDetail
import malok.cryptoapp.domain.repository.CoinRepository
import malok.cryptocurrencyapp.common.Resource
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
){
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).mapToCoinDetail()
            emit(Resource.Success(coin))
        }catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage?:"An unexaption error"))
        } catch (e: IOException){
            emit(Resource.Error("Couldnt reach server."))
        }
    }
}