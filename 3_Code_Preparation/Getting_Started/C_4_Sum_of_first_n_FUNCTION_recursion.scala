import scala.io.StdIn.readInt;
object C_4_Sum_of_first_n_FUNCTION_recursion {
  def Sum(n:Int,sum:Int):Int={
    if(n==0){
      return sum;
    }
    return Sum(n-1,sum+n);
  }
  def main(Args:Array[String]):Unit={
    print("Enter the number :");
    var n:Int=readInt();
    print(Sum(n,0));
  }
}
