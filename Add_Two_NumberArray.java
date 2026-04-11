import java.util.ArrayList;
import java.util.Collections;

public class Add_Two_NumberArray {
    
    public static void main(String[] args) {
        
        int arr1[] = {9,4,7,9,9}; 
        int arr2[] = {9,9,9,3,7};
        ArrayList<Integer> list = new ArrayList<>();
        int minl = Math.min(arr1.length , arr2.length);
        int maxl = Math.max(arr1.length , arr2.length);
        int i = arr1.length - 1, j = arr2.length - 1; 
        int carry = 0;
        while(i >= 0 && j >= 0){
                int sum = arr1[i] + arr2[j] + carry;

                if(sum <= 9){
                    list.add(sum);
                    carry = 0;
                }else{
                    int rem = sum % 10;
                    list.add(rem);
                    carry = 1;
                }
                i--; j--;
            
        }
        while(i >= 0){
            int sum = arr1[i] + carry;
            if(sum <= 9 ){
                list.add(sum);
                carry = 0;
            }else{
                int rem = sum % 10;
                list.add(rem);
                carry = 1;
            }
            i--;  
        }
        while(j >= 0){
            int sum = arr1[j] + carry;
            if(sum <= 9 ){
                list.add(sum);
                carry = 0;
            }else{
                int rem = sum % 10;
                list.add(rem);
                carry = 1;
            }
            j--;  
        }
        if(carry == 1){
            list.add(carry);
        }
        Collections.reverse(list);

        for(int ele : list){
            System.out.print(ele+" ");
        }
        
    }
    
}
