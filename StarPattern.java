public class StarPattern {
    public static void main(String[] args) {
        sp();
    }
    public static void sp() {
        int a=1;
        while (a<=5) {
            int b=1;
            while (b<=a){
                System.out.print("* ");
                b+=1;
            }
            System.out.println();
            a+=1;
        }
    }
}
