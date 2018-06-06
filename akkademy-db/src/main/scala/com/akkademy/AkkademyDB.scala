package com.akkademy

import akka.actor.{Actor, Status}
import akka.event.Logging
import com.akkademy.message.{GetRequest, KeyNotFoundException, SetRequest}

import scala.collection.mutable.HashMap

class AkkademyDB extends Actor{
  val map = new HashMap[String, Object]
  val log = Logging(context.system, this)
  override def receive: Receive = {
    case SetRequest(key, value) => {
      log.info("Recieved SetRequest key - {} , Value {} ",key,value)
      map.put(key,value)
    }
    case GetRequest(key) => {
      val response:Option[Object] = map.get(key)
      response match {
        case Some(x) => sender() ! x
        case None => sender() ! KeyNotFoundException(key)
      }
    }
    case o => Status.Failure(new ClassNotFoundException())
  }
}
