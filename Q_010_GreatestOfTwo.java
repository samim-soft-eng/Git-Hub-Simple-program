// ##10.	WAP to find out  Greatest of two numbers
import java.util.*;

public class Q_010_GreatestOfTwo {

    public static int GreatestOfTwo(int x,int y){
        
        if( x > y) return x;
        else return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Frist No:");
        int frist = sc.nextInt();
        System.out.println("Enter Second No:");
        int second = sc.nextInt();

        System.out.println("The Greatest Value is:"+GreatestOfTwo(frist,second));;
    }
}