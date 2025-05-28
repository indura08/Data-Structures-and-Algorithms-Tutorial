package LeetcodeAnswers.OtherLearnings;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AbstractListLearning {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(foursumPractice(arr, 10).size());
    }

    public static List<List<Integer>> foursumPractice(int[] nums, int target) {
        return new AbstractList<List<Integer>>() {

            private List<List<Integer>> results;
            int length = nums.length;

            @Override
            public List<Integer> get(int index) {
                init();
                return results.get(index);
            }

            @Override
            public int size() {
                init();
                return results.size();
            }

            void init(){
                results = new ArrayList<>();
                Arrays.sort(nums);
                int left = 0;
                int right = nums.length - 1;

                while(left < right){
                    int sum = nums[left] + nums[right];

                    if(sum == target){
                        results.add(Arrays.asList(nums[left], nums[right]));
                        right--;
                        left++;

                        while(left < right && nums[left] == nums[left+1] ) left++;
                        while(left < right && nums[right] == nums[right-1] ) right--;

                    }
                    else if(sum < target){
                        left++;
                    }
                }
                //just like this , meke athule liynna puluwan code logic eka and call krnna puluwan main method eke
            }
        };
    }
}
