/*
package com.akkademy

import akka.actor.{Actor, Props, Status}

object ScalaPongActor{
  def props(message: String) = {
    Props(classOf[ScalaPongActor],message)
  }
}
class ScalaPongActor extends Actor{
  override def receive: Receive = {
    case "ping" => sender ! "pong"
    case _ => sender ! Status.Failure(new Exception("Unknown Message"))
  }
}
*/
