public class Q_006_Swap_without_third_variable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // a = a+b;
        // b = a - b;
        // a = a - b;

        // a = a^b;
        // b = a^b;
        // a = a^b;

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.printf("A=%d and B=%d",a,b);
    }
    
}
