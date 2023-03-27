import scala.math;
import scala.io.StdIn.readFloat;
object P_Root_of_quadratic_equation {
  def main(args:Array[String]):Unit={
    print("Enter a :");
    var a:Float=readFloat();
    print("Enter b :");
    var b:Float=readFloat();
    print("Enter c :");
    var c:Float=readFloat();

    var discriminant:Float=(b*b)-(4*a*c);

    if(discriminant==0){
      var root1:Float=(-b/2*a);
      var root2:Float=(-b/2*a);
      print("Two equal & real root "+root1+" "+root2);
    }
    else if (discriminant>0){
      var root1:Double=((-b)+(math.sqrt(discriminant)/(2*a)));
      var root2:Double=((-b)-(math.sqrt(discriminant)/(2*a)));
      print("Two distinct & real root "+root1+" "+root2);
    }
    else if(discriminant<0){
      var root1:Float=(-b/2*a);
      var root2:Float=(-b/2*a);
      var imajinary:Float=Math.round((math.sqrt(-discriminant)/2*a));
      print("Two distinct complex root "+root1+" "+imajinary+" "+root2+" "+imajinary);
    }
  }
}
