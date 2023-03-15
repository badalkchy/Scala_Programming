import scala.io.StdIn.readInt;
object F_4_Compare_three_FUNCTION_Int {
  def Max(a:Int,b:Int,c:Int): Int = {
    if(a>b){
      if(a>c){
        return(a);
      }
      else{
        return(c);
      }
    }
    else if(b>c){
      return(b);
    }
    else{
      return (c);
    }
  }
  def main(Args:Array[String]):Unit={
    print("Enter the first number :");
    var a:Int=readInt();
    print("Enter the second number :");
    var b:Int=readInt()
    print("Enter the third number :");
    var c:Int=readInt();
    print(Max(a,b,c));
  }
}
