import java.util.*;
abstract class OperatingSystem {
   public static OperatingSystem Install(String os) {
      if(os.equals("IOS")) {
        return new Ios();
      }
      else if(os.equals("ANDROID")) {
        return new Android();
      }
      else {
        return new Windows();
      }
   } 
}
class Android extends OperatingSystem{
  double displaySize=6.5;
  double price=18000;
  String color="Red";
}
class Ios extends OperatingSystem{
  double displaySize=5.5;
  double price=80000;
  String color="Silver-gray";
}
class Windows extends OperatingSystem{
  double displaySize=10.5;
  double price=50000;
  String color="Black";
}
class os {
  public static void main(String[] args) {
    Scanner kbd=new Scanner(System.in);
    
  }
}