import scala.io.StdIn.readInt;
object F_3_Compare_three_FUNCTION_Unit {
  def Max(a:Int,b:Int,c:Int):Unit={
    if(a==b && b==c){
      print("All are numbers equals");
      return;
    }
    var max:Int= if(a>b) a else b;
    if(max<c){
      print(c+" is maximum");
    }
    else{
      print(max+" is maximum");
    }
    return;
  }
  def main(Args:Array[String]):Unit={
    print("Enter the first number :");
    var a:Int=readInt();
    print("Enter the second number :");
    var b:Int=readInt();
    print("Enter the third number :");
    var c:Int=readInt();
    Max(a,b,c);
  }
}
