/*
Bubble Sort compares two elements which are next to each other and exchange
their values.
 */
import java.util.Arrays;

public class BubbleSort_4 {

    static int[] nums = {6,3,8,2,9,1,7};
    static int size = nums.length;
    static int temp = 0;

    public static void main(String[] args) {
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(nums));
        System.out.println();
        System.out.println("sorting started");

        bubbleSort();

        System.out.println();
        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(){
        for (int i=0; i<size; i++){
            for (int j=0; j<size-i-1; j++){
                if(nums[j]<nums[j+1]){ //descending order
                    //exchanging values between two : with using a temp variable
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                System.out.println(Arrays.toString(nums)); //shows every iteration
            }
            System.out.println();
        }
    }

}
