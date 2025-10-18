package LeetcodeAnswers.ArrayProblems;

public class SingleNumber136 {

    public int singleNumber(int[] nums) {
        int result = 0;

        for(int i = 0; i<32; i++){
            int sum = 0;

            for(int num: nums){
                if(((num >> i) & 1)==1){
                    sum++;
                }
            }

            if(sum % 2 !=0){
                result = result | (1 << i);
            }
        }

        return result;
    }
}
