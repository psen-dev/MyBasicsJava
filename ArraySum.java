import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter size of Array: ");
        int size = sc.nextInt();
        int[] Arr= new int[size];
        int m=0;
        while (m<size){
            System.out.println("Enter Element");
            Arr[m]=sc.nextInt();
            m++;
        }
        int sum=Sum(Arr);
        float avg=Avg(Arr);
        System.out.println("Sum of Array:"+sum);
        System.out.println("Average of Array:"+avg);

    }
    public static int Sum(int[] Arr){
        int m=0;
        int sum=0;
        while (m<Arr.length){
            sum+=Arr[m];
            m++;
        }
        return sum;
    }
    public static float Avg(int[] Arr){
        int m=0;
        int sum=0;
        while (m<Arr.length){
            sum+=Arr[m];
            m++;
        }
        return (float)(sum)/5;
    }
}
