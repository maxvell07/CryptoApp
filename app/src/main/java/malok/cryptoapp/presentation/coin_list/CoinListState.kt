package malok.cryptoapp.presentation.coin_list

import malok.cryptoapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins : List<Coin> = emptyList(),
    val error: String = ""
)
