package Implementations.Sort;

public class BubbleSort {

    public static void bubbleSort(int[] array){

        for(int i = 0; i < array.length - 1 ; i++){

            for(int j = 0; j < array.length - 1; j++){

                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {20,85,42,96,39,33,58,14,9,72};

        bubbleSort(array);

        for(int i : array){
            System.out.print(i + ", ");
        }
    }
}
