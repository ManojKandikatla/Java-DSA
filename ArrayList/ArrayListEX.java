import java.util.*;
public class ArrayListEX{
    public static void main (String[]args){
         ArrayList <Integer> arr = new ArrayList<>();
         ArrayList <Integer> arr2 = new ArrayList<>();

        ArrayList<ArrayList <Integer>> temp = new ArrayList<>();

        arr.add(5);
        arr.add(51);
        arr.add(151);
        arr2.add(150);
        arr2.add(15);
        temp.add(arr);
        temp.add(arr2);
        System.out.println(temp);
    }
}