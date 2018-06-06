package com.akkademy

import com.akkademy.message.KeyNotFoundException
import scala.concurrent.ExecutionContext.Implicits.global

object Main extends App {
  val client = new Sclient("127.0.0.1:8000")
  client.set("123", "mufi")
  client.set("456", "jamu")
  val future = client.get("123")
  future.onComplete({
    case x => println("returned value for 123 from map" +x)
  })
  future.onFailure({
    case e: KeyNotFoundException => println("Key Not found in the map")
  })
}
