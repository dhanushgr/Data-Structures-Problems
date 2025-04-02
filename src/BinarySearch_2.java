//Binary search only works in a sorted array

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class BinarySearch_2 {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6,2,9,7};
        Arrays.sort(nums); // this sorts the nums array to ascending order
        System.out.println("Enter the number you want to find in the Array " + Arrays.toString(nums));
        Scanner scanner = new Scanner(System.in);
        int numToFind = scanner.nextInt();

        int result = binarySearch(nums , numToFind);

        if (result != -1){
            System.out.println("Element found at " + result);
        }
        else{
            System.out.println("Element not found");
        }
    }


    /**
     * left, right, and mid are all the indexes we are creating to perform binary search
     *
     * @param nums  The integer of numbers in sorted order
     * @param numToFind the target numer we should find
     * @return  we should return the index of the number which we found
     */
    public static int binarySearch(int[] nums, int numToFind){
        //left, right, and mid represent the indexes
        int n = nums.length;
        int left = 0;
        int right = n-1;

        while (left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] == numToFind){
                return mid;
            }
            else if(nums[mid] < numToFind){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }

}
