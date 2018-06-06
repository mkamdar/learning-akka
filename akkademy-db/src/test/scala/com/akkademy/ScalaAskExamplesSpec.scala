/*
package com.akkademy

import akka.actor.{ActorSystem, Props}
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.duration._
import org.scalatest.{Matchers, WordSpecLike, time}

import scala.concurrent.Await

class ScalaAskExamplesSpec extends WordSpecLike with Matchers{
  val system=ActorSystem()
  implicit val timeout = Timeout(5 seconds)
  val pongActor = system.actorOf(Props(classOf[ScalaPongActor]))

  "Pong actor " should{
    "respond with pong" in {
      val future = pongActor ? "ping"
      val result = Await.result(future.mapTo[String], 1 second)
      assert(result == "pong")
    }
  }
}
*/
