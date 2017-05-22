/**
  * Created by adity on 5/21/2017.
  */
class Location (override val xc: Int , override  val yc: Int, val zc: Int) extends Point(xc,yc) {

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println ("Point x location : " + x);
    println ("Point y location : " + y);
    println ("Point z location : " + z);
  }

}
