import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        System.out.println("enter your numbers : ");
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = {12,65,61,43,59};

        for(int i = 0 ; i < 5 ; i++){
            array1[i] = sc.nextInt();
        }
        System.out.println("your arrays values : ");
        for(int i = 0; i< array1.length ; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println("\n");

        System.out.println("enter the value that you want to find ");
        int n = sc.nextInt();

        int ans = LinearSearch(array2 , n);

        if(ans != -1){
            System.out.println("we found your number at index  of : " + ans);
        }
        else {
            System.out.println("we couldnt find your number");
        }
    }

    public  static int LinearSearch(int[] array , int value){

        for (int i = 0 ; i < array.length ; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }


}
