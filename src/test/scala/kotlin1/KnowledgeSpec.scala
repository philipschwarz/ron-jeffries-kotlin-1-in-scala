package kotlin1

import org.specs2.execute.Result
import org.specs2.matcher.Matchers
import org.specs2.mutable.Specification

import java.awt.Point

class KnowledgeSpec extends Specification with Matchers:

  "kotlin1.Knowledge" should {
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

