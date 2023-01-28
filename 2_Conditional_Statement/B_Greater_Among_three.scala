import scala.io.StdIn.readInt;
object B_Greater_Among_three {
def main(args:Array[String]):Unit={
  print("Enter the first number :");
  val a:Int =readInt();
  print("Enter the second number :");
  val b:Int =readInt();
  print("Enter the third number :");
  val c:Int =readInt();
  var max:Int=a;
  if(b>max){
    max=b;
  }
  if(c>max){
    max=c;
  }
  print(max+" is greater ");
}
}
