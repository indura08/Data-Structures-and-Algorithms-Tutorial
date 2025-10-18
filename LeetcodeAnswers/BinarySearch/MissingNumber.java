package LeetcodeAnswers.BinarySearch;

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums){

        Arrays.sort(nums);

        int low = 0;
        int high = nums.length;

        while(low < high){

            int middle = low + (high - low)/2;

            if(nums[middle] == middle){
                low = middle+1;
            }
            else {
                high = middle;
            }
            return middle;


        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(arr));
    }
}
