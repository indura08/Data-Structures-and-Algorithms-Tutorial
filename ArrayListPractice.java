import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> arraylist1 = new ArrayList<Integer>();

        arraylist1.add(10);
        arraylist1.add(49);
        arraylist1.add(34);
        arraylist1.add(17);

        arraylist1.remove(0);

        arraylist1.add(0,87);

        System.out.println(arraylist1.get(2));

        System.out.println(arraylist1);
        for(int i : arraylist1){
            System.out.println(arraylist1.get(i));
        }
    }
}
