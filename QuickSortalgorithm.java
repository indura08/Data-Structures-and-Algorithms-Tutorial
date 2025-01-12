public class QuickSortalgorithm {

    public static void main(String[] args) {

        int[] array = {3,1,9,6,7,5,4,2,8};

        quickSort(array , 0 , array.length - 1);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] array, int start, int end){

        if(end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot+1, end);

    }

    public static int partition(int[] array, int start, int end){

        int pivot = array[end];
        int i = start - 1;

        for(int j = start ; j <= end - 1 ; j++){
            if(pivot > array[j]){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        //anthimt thiyna pivot eka eeeka thiyenna one thanata maru krnwa
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;

    }
}
