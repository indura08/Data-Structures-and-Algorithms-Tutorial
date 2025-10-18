public class InsertionSortWithWhileLoop {
    public static void main(String[] args) {

        int[] array = {30,90,10,40,100,70,20,60,80,50};

        System.out.println("array before sort: " );
        for(int value : array){
            System.out.print(value + " ");
        }
        System.out.println("\n");

        InsertionSortAlgorithm(array);

        System.out.println("array after sort: " );
        for(int value : array){
            System.out.print(value + " ");
        }
    }

    public static void InsertionSortAlgorithm(int[] array){

        for(int i = 1; i < array.length; i++){
            int temp = array[i];

            int j = i-1;

            while(j>=0){
                if(array[j] > temp){
                    array[j+1] = array[j];
                    array[j] = temp;
                }
                j--;
            }

        }
    }
}
