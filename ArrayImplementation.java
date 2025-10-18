public class ArrayImplementation {

    public static void main(String[] args) {

        int[] array = {2,6,1,7,4};

        traversal(array);
        update(1,array,10);
        System.out.println("");
        traversal(array);

        System.out.println(search(array, 19));

    }

    public static void traversal(int[] array){
        for(int i = 0 ; i<array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void update(int index , int[]array , int value){
        array[index] = value;
    }

    public static void Delete(){

    }

    public static boolean search(int[] array, int value){
        for(int i = 0 ; i< array.length ; i++){
            if(array[i] == value){
                return true;
            }
        }
        return false;


    }
}
