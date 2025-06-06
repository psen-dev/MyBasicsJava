import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1:");
        int num1 = sc.nextInt();
        System.out.println("Enter Number2:");
        int num2 = sc.nextInt();
        int num3=num1;
        num1=num2;
        num2=num3;
        System.out.println("Num1="+num1);
        System.out.println("Num2="+num2);
    }
}
