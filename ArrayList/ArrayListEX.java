import java.util.*;
public class ArrayListEX{
    public static void main (String[]args){
         ArrayList <Integer> arr = new ArrayList<>();
         ArrayList <Integer> arr2 = new ArrayList<>();

        ArrayList<ArrayList <Integer>> temp = new ArrayList<>(6);//it can store more then its capacity because the logic is when ever the array is half full it will dobuble the size of the array and stores the prev values in the doubled array so that we can store n values still the capacity is mentioned

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