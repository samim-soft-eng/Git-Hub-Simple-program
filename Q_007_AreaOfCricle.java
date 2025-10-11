import java.util.*;
public class Q_007_AreaOfCricle {

    public static double Area(double a){
        double result = Math.PI * a * a;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius:");
        double radius = sc.nextDouble();
        System.out.println(Area(radius));
    }
    
}
