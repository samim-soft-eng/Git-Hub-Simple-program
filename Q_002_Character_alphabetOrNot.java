import java.util.*;
public class Q_002_Character_alphabetOrNot {
    
    public static boolean Alphabet_01(char ch){
        ch = Character.toLowerCase(ch);
        return Character.isLetter(ch);
    }

    public static boolean Alphabet_02(char ch){
        ch = Character.toLowerCase(ch);

        if( ch >= 'a' && ch <= 'z'){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Character : ");
        char ch = sc.next().charAt(0);

        if(Alphabet_02(ch)){
            System.out.println("The Character is a Alphabet");
        }else{
            System.out.println("The Character is not a Alphabet");
        }
    }
}
