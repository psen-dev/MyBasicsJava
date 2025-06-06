import java.util.Scanner;
public class Sum_three_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = sc.nextInt();
        System.out.println("Enter Number 3:");
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;
        System.out.println("The sum is:"+sum);
    }
}
