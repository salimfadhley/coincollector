package main

import akka.http.scaladsl.model.HttpResponse
import api.coinmarketcap.CoinMarketCapAPI
import scala.concurrent.ExecutionContext.Implicits.global


object QueryDemo extends App {
  CoinMarketCapAPI.responseFuture.map((response: HttpResponse) =>println(response.entity.toString))

}

