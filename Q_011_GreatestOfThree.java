import java.util.Scanner;

public class Q_011_GreatestOfThree {

    public static int GreatestOfThree(int x,int y,int z){
        
        if(x >= y && x >= z) return x;
        else if(y >= x && y >= z) return y;
        else return z;

    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Frist No:");
        int frist = sc.nextInt();
        System.out.println("Enter Second No:");
        int second = sc.nextInt();
        System.out.println("Enter Thired No:");
        int thired = sc.nextInt();

        System.out.println("The Greatest Value is : "+GreatestOfThree(frist,second,thired));;
    }
    
}
