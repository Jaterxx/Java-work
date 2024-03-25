import java.util.Scanner;

public class avg {
    public static void main(String[] args)
    {
       System.out.println("PlZ input");
       Scanner keyboard=new Scanner(System.in);
       int a=keyboard.nextInt();
       int b=keyboard.nextInt();
       int c=keyboard.nextInt();
       
       double avg=(a+b+c)/3.0;

       System.out.printf("AVG:  %8.2f\n",avg);

    }

}
