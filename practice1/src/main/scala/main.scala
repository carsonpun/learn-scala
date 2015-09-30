import scala.annotation.tailrec
object Main {
  /**
   * calculates factorial (n!) using tail recursion optimization
   * @param n integer
   * @return factorial of n (n!)
   */
  def factorial(n: BigInt) : BigInt = {
    require(n >= 0)
    @tailrec def f(n: BigInt, s: BigInt): BigInt = {
      if (n == 0) s
      else f(n-1, s*n)
    }
    f(n,1)
  }
  
  def main(args: Array[String]) {
    val n = BigInt(args(0))
    println(f"$n%d! = " + factorial(n))
  }
}
