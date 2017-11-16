import akka.http.scaladsl.model.HttpResponse
import api.coinmarketcap.CoinMarketCapAPI

val foo = CoinMarketCapAPI.responseFuture

foo.map((r: HttpResponse) => println(r))