package LeetcodeAnswers.BinarySearch;

import java.util.Arrays;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums , int target){

        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int middle = low + (high - low)/2;

            if(nums[middle] == target){
                return middle;
            }
            else if(nums[middle] > target){
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }

        }

        return low;
    }

    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 2));
    }
}
