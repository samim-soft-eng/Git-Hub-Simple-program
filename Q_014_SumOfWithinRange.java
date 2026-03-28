// WAP to find out Sum of numbers in a given range

import java.util.Scanner;

public class Q_014_SumOfWithinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;

        for(int i=st ; st <= end; st++){
            sum += st;
        }
        System.out.println(sum);
    }
}
