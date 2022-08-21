package kotlin1

import java.awt.Point

class Knowledge:

  val map = scala.collection.mutable.Map[Any,Any]()
  val contents = "contents"

  def doSomething: String =
    "did it"

  def addItemAt(item: Any, at: Point) =
    map.put(at,item)

  def getItem(at: Point): Option[Any] =
    map.get(at)
