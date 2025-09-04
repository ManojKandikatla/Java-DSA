import java.util.*;
public class CountOfStrings{
    public static void main(String[] args){
        HashMap <String,Integer> hm=new HashMap<>();

        String[] arr = {"Hai","to","Bye","Hai","to"};

        for(int i=0;i<arr.length;i++){
            String val = arr[i];

            // if(hm.containsKey(val)){
            //     int curr=hm.get(val);
            //     hm.put(val,curr+1);
            // }else{
            //     hm.put(val,1);
            // }

            //optimized format
            hm.put(val,hm.getOrDefault(val,0)+1);//hm.get(key)+1 refers if condition
            //OrDefault(key,0)+1 else condition and ands only +1
            //value vunte +1 chesthm lekapothe 1 chestham
        }
        for(String s:hm.keySet()){
            System.out.println(s+"="+hm.get(s));
        }
    }
}