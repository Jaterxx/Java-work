import java.util.Scanner;

public class kg {

    public static void main(String[] args)
    {
      final double kgtrn=2.20462;

      System.out.println("please input");
      Scanner keyboard= new Scanner(System.in);
      double kg=keyboard.nextDouble();

      double pg=kg*kgtrn;

      System.out.printf("%9.6f kg = %9.6f pond\n", kg,pg);

    }
    
}
