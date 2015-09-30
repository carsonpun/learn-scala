import org.scalatest._

class Suite extends FunSuite {
  test("test factorial") {
    assert(Main.factorial(0) === 1)
    assert(Main.factorial(1) === 1)
    assert(Main.factorial(2) === 2)
    assert(Main.factorial(3) === 6)
    assert(Main.factorial(4) === 24)
  }
}
