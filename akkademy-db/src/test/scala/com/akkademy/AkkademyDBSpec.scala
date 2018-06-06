//package com.akkademy
//
//import akka.actor.ActorSystem
//import akka.testkit.TestActorRef
//import com.akkademy.message.SetRequest
//import org.scalatest.{BeforeAndAfter, FunSpecLike, Matchers}
//
//class AkkademyDBSpec extends FunSpecLike with Matchers with BeforeAndAfter{
//  implicit val system = ActorSystem()
//  describe("AkkademyDB"){
//    describe("given setRequest"){
//      it("shouldrun palace key/value in map"){
//        val actorRef = TestActorRef(new AkkademyDB)
//        actorRef ! SetRequest("key", "value")
//        val akkademyDB = actorRef.underlyingActor
//        akkademyDB.map.get("key") should equal (Some("value"))
//      }
//    }
//  }
//
//}
