package LeetcodeAnswers.ArrayProblems;

public class MoveZeroes283 {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println();
        for(int i : nums){
            System.out.print(i + ", ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        int[] numsCopy = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                numsCopy[count] = nums[i];
                count++;
            }
        }

        for(int j = 0; j< nums.length; j++){
            nums[j] = numsCopy[j];
        }
        
        //in this hodt mathk thiygnna one deykl thami aluthing array ekk hadaddi e array ekt size ekk deela thoiynwa nm e array eke add wenne nathi index walt 0 watenwa
    }
}
