import scala.io.StdIn.readInt;
object F_1_Compare_three_Inbuilt_FUNCTION {
  def main(Args:Array[String]):Unit={
    print("Enter the first num :");
    var a:Int=readInt();
    print("Enter the second num :");
    var b:Int=readInt();
    print("Enter the third num :");
    var c:Int=readInt();
    var max:Int=Math.max(c,(Math.max(a,b)));
    if(a==b && b==c){
      print("All numbers are equal");
    }
    else{
    print(max+" is maximum number ");
    }
  }
}
