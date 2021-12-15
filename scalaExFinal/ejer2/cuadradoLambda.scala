// compilar utilizamos scalac : ejer2> scalac .\cuadradoLambda.scala
// Ejecucion scala : ejer2> scala cuadradoLambda.scala   

// funcionamiento de la expresión lambda
// Creando objeto
object cuadrado
{    // lambda expression
    val eleva = (x:Int) => scala.math.pow(x,2)
      
    // Main method
    def main(args:Array[String])
    {  
      println("5^2 ="+eleva(5)) //5^2 =25.0
    }
}