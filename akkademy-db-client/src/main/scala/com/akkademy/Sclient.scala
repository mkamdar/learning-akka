package com.akkademy

import akka.actor.ActorSystem
import akka.util.Timeout
import com.akkademy.message.{GetRequest, SetRequest}

import scala.concurrent.duration.DurationDouble
import akka.pattern.ask

import scala.concurrent.Future

class Sclient(remoteAddress: String) {

  private implicit val timeout = Timeout(2 seconds)
  private implicit val system = ActorSystem("LocalSystem")
  private val remoteDB = system.actorSelection(s"akka.tcp://akkademy@$remoteAddress/user/akkademy-db")

  def set(key:String, value:String): Future[Any] ={
      remoteDB ? SetRequest(key,value)
  }
  def get(key: String): Future[Any] ={
    remoteDB ? GetRequest(key)
  }
}
