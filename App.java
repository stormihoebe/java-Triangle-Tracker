// import java.lang.System.out;
import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class App{
  public static void main(String[] args) {
    Console myConsole = System.console();
    // for(int i = 0; i<3; i++){

      System.out.println("Enter length for triangle side:");
      Scanner scan = new Scanner(System.in);
      int side1 = scan.nextInt();
      int side2 = scan.nextInt();
      int side3 = scan.nextInt();
      System.out.println("Your sides are: " + side1 +  ", " + side2 + ", " + side3);

      Triangle userTriangle = new Triangle(side1,side2,side3);
      String result = userTriangle.isTriangle(side1,side2,side3);
      System.out.println("Your lengths result in: "  + result);
    }
}
