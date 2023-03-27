import scala.io.StdIn.readInt;
object O_Equilateral_Isosceles_Scalane_traingle {
def main(args:Array[String]):Unit={
  print("Enter 1st number :");
  val a:Int=readInt();
  print("Enter the 2nd number :");
  val b:Int=readInt();
  print("Enter the 3rd number :");
  val c:Int=readInt();
  if(a>0 && b>0 && c>0){
    if(a==b && b==c){
      print("Equilateral triangle");
    }
    else if ((a==b && b!=c) || (a==c && a!=b) || (b==c && a!=b)){
      print("Isosceles traingle");
    }
    else{
      print("Scalane traingle");
    }
  }
}
}
