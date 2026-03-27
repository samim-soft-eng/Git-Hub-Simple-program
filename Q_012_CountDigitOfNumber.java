// 12.	WAP to find out Number of digits in an integer

import java.util.*;

public class Q_012_CountDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while(num != 0){
            num /= 10;

            count ++;
        }
        System.out.print("Count of the Num = " + count);
    }
    
}
