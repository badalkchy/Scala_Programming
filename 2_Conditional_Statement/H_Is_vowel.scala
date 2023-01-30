import scala.io.StdIn.readChar;
object H_Is_vowel {
  def main(args:Array[String]): Unit = {
    print("Enter the number :");
    var ch:Char=readChar();
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch== 'u'){
      print("Vowel");
    }
    else{
      print("Not an vowel");
    }
  }
}
