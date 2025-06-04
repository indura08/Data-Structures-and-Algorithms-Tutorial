package LeetcodeAnswers.ArrayProblems;

public class GasStation134 {

    public static void main(String[] args) {
        //this is how we travers a array in a circular way for pre defined times (count times , in this cases)
        int[] nums = {10,20,30,40};

        int start = 2;
        int count = 10;

        int n = nums.length;;

        for(int i = 0; i < count; i++){
            int index =  (start + i)%n;
            System.out.print(nums[index] +", ");
        }
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {

        return 1;
    }
}
