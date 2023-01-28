import scala.io.StdIn.readInt;
object A_Greater_Among_two {
  def main(args:Array[String]):Unit={
    print("Enter the number :");
    val a: Int=readInt();
    print("Enter the second number :");
    val b:Int =readInt();
    if(a>b){
      print(a+" is greater ");
    }
    else{
      print(b+" is greater");
    }
  }
}
