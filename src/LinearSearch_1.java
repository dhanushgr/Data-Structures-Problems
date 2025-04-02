import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch_1 {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6,2,9,7};
        System.out.println("Enter the number you want to find in the Array " + Arrays.toString(nums));
        Scanner scanner = new Scanner(System.in);
        int numToFind = scanner.nextInt();

        int result = linearSearch(nums , numToFind);

        if (result != -1){
            System.out.println("Element found at " + result);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static int linearSearch(int[] nums, int numToFind){
        int n = nums.length;
        for(int i=0; i<=n-1; i++){
            if(nums[i] == numToFind){
                return i;
            }
        }
        return -1;
    }
}
