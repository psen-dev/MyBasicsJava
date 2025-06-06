public class IncrementOperators {
    public static void main(String[] args) {
        System.out.println("X++ Testing");
        int x=5;
        System.out.println("X is"+x);
        x++;
        System.out.println("X is"+x);
        int y=x++;
        System.out.println("X is"+x);
        System.out.println("Y is"+y);

        System.out.println("++X Testing");
        x=5;
        System.out.println("X is"+x);
        ++x;
        System.out.println("X is"+x);
        y=++x;
        System.out.println("X is"+x);
        System.out.println("Y is"+y);
    }
}
