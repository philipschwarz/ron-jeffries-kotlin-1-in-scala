
import org.specs2.execute.Result
import org.specs2.matcher.Matchers
import org.specs2.mutable.Specification

import java.awt.Point

class KnowledgeSpec extends Specification with Matchers:

  "Knowledge" should {
    "hookup" in hookup
    "create one" in createOne
    "add and retrieve item" in addAndRetrieveItem
  }

  def hookup: Result =
    "ron" must beEqualTo("ron")

  def createOne: Result =
    val knowledge = Knowledge()
    knowledge.contents must beEqualTo("contents")
    knowledge.doSomething must beEqualTo("did it")
    knowledge must beAnInstanceOf[Knowledge]

  def addAndRetrieveItem: Result =
    val k = Knowledge()
    k.addItemAt(item="Hello", at=Point(10,10))
    k.getItem(Point(10,10)) must beSome("Hello")

class Knowledge:

  val map = scala.collection.mutable.Map[Any,Any]()
  val contents = "contents"

  def doSomething: String =
    "did it"

  def addItemAt(item: Any, at: Point) =
    map.put(at,item)

  def getItem(at: Point): Option[Any] =
    map.get(at)

class Fact(aThing: Any):
  val thing = aThing