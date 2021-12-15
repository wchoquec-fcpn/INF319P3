// -	Calculadora con funciones de orden superior 

// Para compilar utilizamos : ejer4> scalac .\calculadoraOrdSup.scala
// Para Ejecucion scala : ejer4> scala calculadoraOrdSup.scala
object ordenSuperior {
    def suma(a:Int,b:Int):Int = a + b; 
    def resta(a:Int,b:Int):Int=a-b
    def multiplica(a:Int,b:Int):Int=a*b
    def divide(a:Int,b:Int):Int=a/b
    //El parámetro de la función es la función
    def fun(a:Int,b:Int,calcu:(Int,Int)=>Int)={
    calcu(a,b);
    }
    def main(args: Array[String]): Unit = {
     println( fun(8,2,suma));
     println( fun(8,2,resta));
     println( fun(8,2,multiplica));
     println( fun(8,2,divide));
    }
}