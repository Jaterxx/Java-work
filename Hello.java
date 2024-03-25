import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入姓名");
        String strName = scn.next();
        System.out.println("HI! "+strName +", welcome to Java world!!");
    }
}