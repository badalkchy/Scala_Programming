import scala.io.StdIn.readInt;
object D_4_Function_Inside_Object {
  object Math{
    def add(a:Int, b:Int):Int={
      var sum:Int=a+b;
      return(sum);
    }
  }
  def main(Args:Array[String]):Unit={
    print("Enter the two number :");
    var n:Int=readInt();
    var m:Int=readInt();
    print(Math.add(n,m));
//    print(Math.max(n,m));
  }
}
