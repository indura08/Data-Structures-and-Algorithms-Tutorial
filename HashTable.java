import java.util.*;
public class HashTable {
    public static void main(String[] args) {

        Hashtable<Integer, String> tab1 = new Hashtable<>(10 /*, 0.5f*/);
        // methandi capacity eka 10 ta sdeema kala namuth hashtable ekn 50% wadi weddi automa hash table eka expand krgnnwa thwa elements ganna

        tab1.put(101, "Kiribathgoda");
        tab1.put(100, "colombo");
        tab1.put(106, "kaduwela");
        tab1.put(103, "kadawatha");
        tab1.put(102, "kelaniya");
        tab1.put(200, "fort");

        System.out.println(tab1.size());
        System.out.println(tab1.entrySet());

        /*for(int key : tab1.keySet()){
            System.out.println(key +  " \t " + tab1.get(key) + "\n");
        }*/
        for(Integer key : tab1.keySet()){
            System.out.println(key.hashCode() +  "  " + tab1.get(key));
        }
    }
}
