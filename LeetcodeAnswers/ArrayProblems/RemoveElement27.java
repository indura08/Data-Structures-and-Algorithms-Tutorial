package LeetcodeAnswers.ArrayProblems;

import java.util.HashSet;

public class RemoveElement27 {

    public static int removeElement(int[] nums, int val){
        int k = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
