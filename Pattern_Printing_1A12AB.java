import java.util.Scanner;

public class Pattern_Printing_1A12AB {

    // 1
    // A B 
    // 1 2 3
    // A B C D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i % 2 != 0){
                    System.out.print(j + " ");
                }else{
                    System.out.print((char)(j + 64) + " ");
                }
            }
            System.out.println();
        }
    }
    
}
