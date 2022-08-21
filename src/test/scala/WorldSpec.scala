import org.specs2.execute.Result
import org.specs2.matcher.Matchers
import org.specs2.mutable.Specification

import java.awt.Point

enum WorldThing { case Obstacle, Pit, Seen }

class World:

  val knowledge: Knowledge = Knowledge()

  def addObstacle(x: Int, y: Int): Unit =
    knowledge.addItemAt(WorldThing.Obstacle, Point(x,y))

  def lookAt(x: Int, y: Int): Option[Any] =
    knowledge.getItem(Point(x,y))

class WorldSpec extends Specification with Matchers:

  "World" should {
    "hookup" in hookup
    "has an obstacle" in hasAnObstacle
  }

  def hookup: Result =
    2 must beEqualTo(2)

  def hasAnObstacle: Result =
    val world = World()
    world.addObstacle(12,12)
    val o = world.lookAt(12,12)
    o must beSome(WorldThing.Obstacle)