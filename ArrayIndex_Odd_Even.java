public class ArrayIndex_Odd_Even {

    public static void OddEven(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                nums[i] += 10;
            }else{
                nums[i] *= 2;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        OddEven(arr);

        for(int num : arr){
            System.out.println(num);
        }
    }
    
}
