object FactorialRecursion {
    def main(args: Array[String]) {
        println(factorial(5)) //120
    }
    def factorial(n: Int): Int = {
      if (n == 0) 
          return 1
      else
          return n * factorial(n-1)
    }
}


// Para compilar utilizamos scalac : ejer1> scalac .\FactorialRecursion.scala
// Para Ejecucion scala : ejer1> scala FactorialRecursion.scala