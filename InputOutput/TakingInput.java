import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
   public TakingInput() {
   }

   public static void main(String[] var0) {
      // Scanner var1 = new Scanner(System.in);
      // System.out.println("Enter the number for Num1:");
      // int var2 = var1.nextInt();
      // System.out.println("Enter the number for Num2:");
      // int var3 = var1.nextInt();
      // int var4 = var2 + var3;
      // System.out.println("Answer is: " + var4);
      // BigInteger var5 = var1.nextBigInteger();
      // System.out.println("Biginteger: " + String.valueOf(var5));
      // System.out.println("Enter the value for flag");
      // boolean var6 = var1.nextBoolean();
      // System.out.println("Enter the value for shortVal");
      // short var7 = var1.nextShort();
      // System.out.println("Enter the value for floatValue");
      // float var8 = var1.nextFloat();
      // System.out.println("flag is: " + var6);
      // System.out.println("shortVal is: " + var7);
      // System.out.println("floatValue is: " + var8);
      // var1.close();

      // Name output //
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter name: ");
      String name = sc.nextLine();
      System.out.println(" Hello " + name);

      // Addition //
      System.out.println("Enter First Number: ");
      int num1 = sc.nextInt();
      System.out.println("Enter Second Number: ");
      int num2 = sc.nextInt();

      System.out.println("Sum = " + (num1 + num2));

      // Rectangle area //

      System.out.println("Enter length: ");
      int length = sc.nextInt();
      System.out.println("Enter Width: ");
      int Width = sc.nextInt();

      System.out.println("Area = " + length * Width);

      // Student Marrks //
      System.out.println("Enter the Java marks: ");
      int Sub1 = sc.nextInt();
      System.out.println("Enter the DSA marks: ");
      int Sub2 = sc.nextInt();
      System.out.println("Enter the CPP Marks: ");
      int Sub3 = sc.nextInt();

      System.out.println("Total Calculate = " + (Sub1 + Sub2 + Sub3));

      // Square root cube //
      System.out.println("Enter Number: ");
      int Square = sc.nextInt();
      System.out.println("Square = " + Square * Square);
      System.out.println("Cube = " + Square * Square * Square);
   }
}
