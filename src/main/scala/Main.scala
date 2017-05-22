/**
  * Created by adity on 5/10/2017.
  */
object Main {

  def main(args: Array[String]): Unit = {
    val pt = new Point(10, 20);

    // Move to a new location
    pt.move(10, 10);

    // Aditya Branch
    val loc = new Location(10, 20, 15);
    loc.move(10, 10, 5);

  }
}
