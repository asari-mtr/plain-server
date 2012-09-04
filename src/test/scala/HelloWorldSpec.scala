import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

@RunWith(classOf[JUnitRunner])
class HelloWorldSpec extends Specification {

    "The 'Hello world' string" should {
        "contain 11 characters" in {
            "Hello world" must have size(11)
        }
        "start with 'Hello'" in {
            "Hello world" must startWith("Hello")
        }
        "end with 'Hello'" in {
            "Hello world" must endWith("world")
        }
    }
}
