package malok.cryptoapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import malok.cryptoapp.data.repository.CoinRepositoryImpl
import malok.cryptoapp.domain.repository.CoinRepository
import malok.cryptocurrencyapp.common.Constants
import malok.cryptocurrencyapp.data.remote.dto.CryptoApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule  {

    @Provides
    @Singleton
    fun provideCryptoApi(): CryptoApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CryptoApi::class.java)

    }

    @Provides
    @Singleton
    fun providCoinRepsoitory(api: CryptoApi): CoinRepository{
        return CoinRepositoryImpl(api)
    }

}