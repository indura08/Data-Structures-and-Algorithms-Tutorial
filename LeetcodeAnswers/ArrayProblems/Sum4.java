package LeetcodeAnswers.ArrayProblems;

import java.util.*;

public class Sum4 {

    public static void main(String[] args) {
        //main menthod to test
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> list = fourSum(arr, -294967296);

        for(List<Integer> l : list){
            for(Integer i : l){
                System.out.print(i+ ", ");
            }
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target){
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> resultSet = new HashSet<>();

        // I have to travel through the array usin two pointer method to calculate the sum
        for(int i = 0; i<nums.length - 2; i++){
            for(int j = i+1; j < nums.length - 2 ;  j++){
                int left = j+1;
                int right = nums.length - 1;

                while(left < right){

                    //int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];

                    if(sum == target){

                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        Collections.sort(list);

                        if(!resultSet.contains(list)){
                            resultSet.add(list);
                        }

                        left++; right--;

                    }else if(sum > target){
                        right--;
                    }
                    else {
                        left++;
                    }
                }
            }
        }

        for(List<Integer> list: resultSet){
            Collections.addAll(result, list);
        }
        return result;
    }
}
