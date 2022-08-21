package kotlin1

import java.awt.Point

class World:

  val knowledge: Knowledge = Knowledge()

  def addObstacle(x: Int, y: Int): Unit =
    knowledge.addItemAt(WorldThing.Obstacle, Point(x,y))

  def lookAt(x: Int, y: Int): Option[Any] =
    knowledge.getItem(Point(x,y))