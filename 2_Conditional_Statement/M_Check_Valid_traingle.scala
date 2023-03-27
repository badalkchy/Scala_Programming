import scala.io.StdIn.readInt;
object M_Check_Valid_traingle {
def main(args:Array[String]):Unit={
  print("Enter the first angle :");
  var a:Int=readInt();
  print("Enter the second angle :");
  var b:Int=readInt();
  print("Enter the third angle :");
  var c:Int=readInt();
  if(a+b+c==180 && a>0 && b>0 && c>0){
    print("Valid traingle");
  }
  else{
    print("Non valid traingle");
  }
}
}
