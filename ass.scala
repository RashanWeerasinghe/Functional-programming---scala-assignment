object ass extends App{

val x = Point(2,3)
val y = Point(5,1)

println(x.add(y))
println(x.move(4,6))
println(y.distance(x))
println(x.invert())

}
case class Point(a: Int, b: Int) {
  def x = a
  def y = b

  def add(c: Point) = Point(c.x + x, c.y + y)

  def move(dx: Int, dy: Int) = Point(x + dx, y + dy)

  def distance(c: Point) = math.sqrt(math.pow(y - c.y, 2) + math.pow(x - c.x, 2))

  def invert() = Point(b, a)
}

