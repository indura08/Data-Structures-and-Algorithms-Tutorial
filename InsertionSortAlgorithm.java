public class InsertionSortAlgorithm {
    public static void main(String[] args) {

        int[] array1= {30,12,4,98,21,59,85,33,15,2,61,54,37};
        System.out.println("array before sort: " );
        for(int value : array1){
            System.out.print(value + " ");
        }
        System.out.println("\n");

        InsertionSortAlgorithm(array1);

        System.out.println("array after sort: " );
        for(int value : array1){
            System.out.print(value + " ");
        }

    }

    public static void InsertionSortAlgorithm(int[] array){
        for(int i = 1 ; i < array.length; i++){
            int temp = array[i];
            for(int j = i ; j >0 ; j--){
                if(array[j-1] > temp){
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}
