package $oganization$.web.resources

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.Stack

class IndexSpec extends WordSpec with ShouldMatchers {
  "Index" should {
    val index = new IndexResource
    "render Hello from Jersey" in {
      assert(index.message === "<h1>Hello Bryan, From Jersey</h1>")
    }
    "render Hello from Velocity" in {
      assert(index.velocity.indexOf("<h1>Hello Bryan, from Velocity</h1>") != 1)
    }
  }
}