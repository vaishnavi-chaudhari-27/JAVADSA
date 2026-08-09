import java.math.BigInteger;
import java.util.Scanner;
public class TakingInput {
   public TakingInput() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the number for Num1:");
      int var2 = var1.nextInt();
      System.out.println("Enter the number for Num2:");
      int var3 = var1.nextInt();
      int var4 = var2 + var3;
      System.out.println("Answer is: " + var4);
      BigInteger var5 = var1.nextBigInteger();
      System.out.println("Biginteger: " + String.valueOf(var5));
      System.out.println("Enter the value for flag");
      boolean var6 = var1.nextBoolean();
      System.out.println("Enter the value for shortVal");
      short var7 = var1.nextShort();
      System.out.println("Enter the value for floatValue");
      float var8 = var1.nextFloat();
      System.out.println("flag is: " + var6);
      System.out.println("shortVal is: " + var7);
      System.out.println("floatValue is: " + var8);
      var1.close();
   }
}
