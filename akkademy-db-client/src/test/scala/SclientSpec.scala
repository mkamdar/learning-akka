import akka.util.Timeout
import org.scalatest.{Matchers, WordSpecLike}
import com.akkademy.Sclient
import scala.concurrent.duration._

import scala.concurrent.Await
class SclientSpec extends WordSpecLike with Matchers {
  val client = new Sclient(s"127.0.0.1:8000")
  "Akka Client" should{
    "Get Values from remote actor" in{
      val future = client.get("456")
      val result = Await.result(future, 10 minutes)
      println(s"***************Result************: $result")
      result should equal("jamu")
    }
  }

}
