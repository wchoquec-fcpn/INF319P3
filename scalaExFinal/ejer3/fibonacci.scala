
// Para compilar utilizamos scalac :\desPalCarS> scalac .\descomponePalChar.scala
// Para Ejecucion scala :\desPalCarS> scala descomponePalChar.scala 
object funcionScala {
    
def fib2( n : Int ) : Int = {
  var a = 0
  var b = 0
  var c = 1
  var d = 1  
  var e = 0
   
 for(i <- 1 to n){
    e=a+b+c+d;
	a = b;
	b = c;
	c = d;
	d = e;
  } 
  return a
}
    def main(args: Array[String]) {       
      var n = 10       
      for(i <- 0 to n-1){
      print( fib2(i)+ ",")
      }
    }
  //0,0,1,1,2,4,8,15,29,56,  
}  
