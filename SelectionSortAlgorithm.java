public class SelectionSortAlgorithm {

    public static void main(String[] args) {
        int[] array = {9,3,2,5,4,7,6,8,1,};
        int[] array1 = {20,45,1,44,2,8,10,70,112};

        System.out.println("array before sort ");
        for(int value : array1){
            System.out.print(value + " ");
        }

        System.out.println("\n");

        selectionSort(array1);

        System.out.println("array before sort ");
        for(int value : array1){
            System.out.print(value + " ");
        }

    }

    public static void selectionSort(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            for (int j = i+1 ; j < array.length ; j++){
                int min = i;
                if(array[min] > array[j]){
                    min = j;
                }

                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;

            }
        }
    }

}
