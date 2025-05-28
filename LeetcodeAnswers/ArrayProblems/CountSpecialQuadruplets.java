package LeetcodeAnswers.ArrayProblems;

import java.util.Arrays;

public class CountSpecialQuadruplets {

    public int countQuadruplets(int[] nums) {
        int count = 0;

        for(int i = 0 ; i<nums.length - 3; i++){
            for(int j = i+1; j<nums.length - 2; j++){
                for(int k = j+1; k<nums.length; k++){
                    int right = nums.length - 1;

                    while(right>k){
                        if(nums[i] + nums[j] + nums[k] == nums[right]){
                            count++;
                        }
                        right--;
                    }
                }
            }
        }

        return count;
    }
}
