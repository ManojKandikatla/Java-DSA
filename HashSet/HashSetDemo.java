import java.util.*;
public class HashSetDemo{
    public static void main(String[]args){
        HashSet <Integer> hs=new HashSet<>();
        hs.add(8);
        hs.add(88);
        hs.add(5);
        if(hs.contains(5)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        System.out.println(hs.size());
    }
}