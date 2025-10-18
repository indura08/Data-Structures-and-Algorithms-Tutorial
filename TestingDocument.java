public class TestingDocument {

    public static void main(String[] args) {

        int[] array = {5,1,9,7,6,3,8,2,4};

        quickSort(array, 0 , array.length - 1);
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] array, int start, int end){

        if(end<= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1 , end);
    }

    public static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;

        // mulu array eka puawtama pivot ekt wada j eka wadid ehma nm i ekai j ekai swap kra kra ynwa
        for(int j = start; j <= end-1 ; j++){
            if(pivot > array[j]){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        // dan pivot eka hari thanata ganna one ekati me code eka ghnne
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
    
}
