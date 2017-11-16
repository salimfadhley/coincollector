package api.coinmarketcap

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{HttpRequest, HttpResponse}
import akka.stream.ActorMaterializer
import api.common.MarketDataAPI

import scala.concurrent.Future

object CoinMarketCapAPI extends MarketDataAPI {



  def responseFuture: Future[HttpResponse] = {
    implicit val system: ActorSystem = ActorSystem()
    implicit val materializer: ActorMaterializer = ActorMaterializer()
    Http().singleRequest(HttpRequest(uri = "https://api.coinmarketcap.com/v1/ticker/"))
  }

}
