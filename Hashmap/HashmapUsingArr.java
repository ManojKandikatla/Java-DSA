 import java.util.*;
 public class HashmapUsingArr{
    public static void main(String[] args){

        HashMap <Integer,Integer> macha =new HashMap<>();//syntax

        int[] arr ={3,6,4,1,7,3};
        for(int i=0;i<arr.length;i++){
           
            int n = arr[i];
            if(macha.containsKey(n)){//checks if element present or not for every itteration
           int prev = macha.get(n);//get method
            macha.put(n,prev+1);
            }else{
            macha.put(n,1);
            }
        }

         for(int values:macha.keySet()){
            System.out.println(values+" = "+macha.get(values));//prints all values with keys and values
         }
    }
 }
 