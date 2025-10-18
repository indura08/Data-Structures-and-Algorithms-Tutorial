package LeetcodeAnswers.ArrayProblems;

public class GasStation134 {

    public static void main(String[] args) {
        //this is how we travers a array in a circular way for pre defined times (count times , in this cases)
        int[] nums = {10,20,30,40};

        int start = 2;
        int count = 10;

        int n = nums.length;

        for(int i = 0; i < count; i++){
            int index =  (start + i)%n;
            System.out.print(nums[index] +", ");
        }
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalTank = 0;
        int currentTank = 0;
        int startStation = 0;
        int n = gas.length;

        for(int i = 0 ; i < n; i++){
            int fuelTank = gas[i] - cost[i];
            totalTank += fuelTank;
            currentTank += fuelTank;

            if(currentTank < 0){
                startStation = i + 1;
                currentTank = 0;
            }
        }

        return totalTank >= 0 ? startStation : -1;

    }
}

