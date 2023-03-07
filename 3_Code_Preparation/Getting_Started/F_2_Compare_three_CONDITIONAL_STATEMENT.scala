import scala.io.StdIn.readInt;
object F_2_Compare_three_CONDITIONAL_STATEMENT {
  def main(Args:Array[String]):Unit={
    print("Enter the first number :");
    var a:Int=readInt();
    print("Enter the second number :");
    var b:Int=readInt();
    print("Enter the third number :");
    var c:Int=readInt();

    var max:Int=a;
    if(max==b && max==c){
      print("All numbers are equal ");
    }
    else{
    if(b>max){
      max=b;
    }
    if(c>max){
      max=c;
    }
    print(max+" is maximum number ");
    }
  }
}
