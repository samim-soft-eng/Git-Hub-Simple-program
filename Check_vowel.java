import java.util.*;
public class Check_vowel {

    public static boolean vowel(char c){
        c = Character.toLowerCase(c);
        if( c == 'a' || c == 'e' || c == 'i' || c== 'o' || c== 'u'){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The character:");
        char c = sc.next().charAt(0);

        if(vowel(c)){
            System.out.printf("The char '%c' is an vowel",c);
        }else{
            System.out.println("It is not a vowel.....");
        }

    }
}