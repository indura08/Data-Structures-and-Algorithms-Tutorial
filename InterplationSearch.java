import java.util.Scanner;
public class InterplationSearch {
    public static void main(String[] args) {

        //Scanner  sc = new Scanner(System.in);

        int[] array = {1,4,9,16,25,36,49, 64, 81,100,121,144,169,196,225,256,289,324,361,400};
        int[] array1 ={1,2,4,8,16,32,64,128,256,512};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};

        int index = interpolationSearch(array2,2);

        if(index != -1){
            System.out.println("we found your index at index of " + index);
        }
        else{
            System.out.println("we couldnt find your value");
        }

    }

    public static int interpolationSearch(int[] array, int value){

        int high = array.length - 1;
        int low = 0;

        while(value <= array[high] && value >= array[low] && low <= high){

            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("probe is : " + probe);

            if(array[probe] == value){
                return probe;
            }
            else if (array[probe] < value){
                low = probe + 1;
            }
            else {
                high = probe - 1;
            }

            /*else{
                low = probe + 1;
            }*/
        }

        return -1;
    }
}
