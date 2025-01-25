import javax.swing.*;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {0,1,2,3,4,5,6,7};

        int index = BinarySearch(array , 0);
        //System.out.println(array.length);

        if(index == -1){
            System.out.println("we couldn't find the value");
        }
        else{
            System.out.println("we found your value ");
        }
    }

    public static int BinarySearch(int[] array , int target){

        int low = 0;
        int high = array.length - 1;

        while(low <= high){

            int middle = low +(high - low)/2;

            System.out.println("middle: " + middle);
            int middleValue = array[middle];

            if(target > middleValue){
                low = middle + 1;
            }

            else if (target < middleValue ){
                high = middle - 1;
            }
            else {
                return middleValue;
            }
        }
        return -1;
    }
}
