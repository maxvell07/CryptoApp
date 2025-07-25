package malok.cryptoapp.data.remote.dto

import malok.cryptoapp.domain.model.Coin

data class CoinDto(
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDto.mapTOCoin(): Coin{
return Coin(
    id= id,
    is_active =is_active,
    name= name,
    rank= rank,
    symbol=symbol
)
}