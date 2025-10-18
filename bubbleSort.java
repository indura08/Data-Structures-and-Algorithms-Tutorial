public class bubbleSort {
    public static void main(String[] args) {

        int[] array = {7,2,9,10,6,3,5,8,4,1};
        int[] array1 = {12,1,6,19,20,2,8,10, 5 ,3,4,16,11,9,15,7,13,17,14,18};
        System.out.println("before bubble sort: ");

        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        bubbleSort(array);
        System.out.println("after bubble sort: ");

        for(int i : array){
            System.out.print(i + " ");
        }

    }

    public static void bubbleSort(int[] array){

        for(int i = 0 ; i < array.length-1 ; i++){

            for(int j = 0 ; j < array.length-1 ; j++){

                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }



}
