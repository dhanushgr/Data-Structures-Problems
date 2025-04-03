/*
Binary search by recursive function calls.
we have to give more parameters in here than regular binary search
while calling it recursively, we have to change the left and right in the parameter itself.
 */

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Recursive_3 {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6, 2, 9, 7};
        Arrays.sort(nums); // Sorting the array before applying binary search
        System.out.println("Enter the number you want to find in the Array " + Arrays.toString(nums));

        Scanner scanner = new Scanner(System.in);
        int numToFind = scanner.nextInt();
        scanner.close();

        int result = binarySearch(nums, 0, nums.length - 1, numToFind);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    /**
     *
     * @param nums sorted array of numbers
     * @param left left most element(smallest)
     * @param right right most element(greatest)
     * @param numToFind
     * @return index where the num is found
     */
    public static int binarySearch(int[] nums, int left, int right, int numToFind) {
        if (left > right) {
            return -1; // Element not found
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] == numToFind) {
            return mid; // Element found
        } else if (nums[mid] < numToFind) {
            return binarySearch(nums, mid + 1, right, numToFind); // Search right half
        } else {
            return binarySearch(nums, left, mid - 1, numToFind); // Search left half
        }
    }
}
