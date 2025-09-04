import java.util.*;
public class Hashmap{
    public static void main(String[] args){
        HashMap <Integer,Integer> macha =new HashMap<>();//syntax
        macha.put(2,5);//key,value using put
        macha.put(3,47);
        macha.put(7,2);

      
        int n=7;
        if(macha.containsKey(n)){
           int prev = macha.get(7);//get method
            macha.put(n,prev+1);
        }else{
            macha.put(7,1);
        }
        // macha.put(3,prev+1);//put
        System.out.println(macha);
        System.out.println(macha.get(7));
        System.out.println(macha.get(3));//key gives us value

        for(int values:macha.keySet()){
            System.out.println(values+" = "+macha.get(values));//prints all values with keys and values
        }
    }
}