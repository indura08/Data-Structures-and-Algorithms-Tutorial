public class MergeSortAlgorithm {
    public static void main(String[] args) {

        int[] array = {4,2,9,7,1,3,5,8,6};

        mergeSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] array){
        int length = array.length;
        if(length <= 1) return;

        int middle = length/2 ;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        /*int i = 0;
        int j = 0;

        for(; i<length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i]; // methandi array[i] wenne methnt enwa nm aniwaryenma i eka middle value ekat wad wadi middle value ekn eh pattata panala.
                j++;
            }
        }*/


        for(int i = 0 ; i < leftArray.length; i++){ //meken krnne loku array eke elements podi array ekat wattanwa.
            leftArray[i] = array[i];
        }
        for(int j = 0 ; j < rightArray.length ; j++ ){ //mekenuth krnneth loku array ekn podi array ekt wattanwa.
            rightArray[j] = array[j + middle];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);
    }


    public static void merge(int[] array, int[] leftArray, int[] rightArray){

        int leftsize = array.length/2;
        int rightsize = array.length - leftsize;
        int i = 0  , l = 0  , r = 0;

        //check the condition for merging
        while(leftsize > l && rightsize > r){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftsize){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while(r < rightsize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

}