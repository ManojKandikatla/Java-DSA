import java.util.*;
public class NumberOfGoodPairs{
    public static void main(String[]args){
        int arr[]= {1,1,1,1};
        int ans=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]==arr[i]){
        //             ans++;
        //         }
        //     }
        // }
        //System.out.println(ans);
        HashMap <Integer,Integer> hm= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                //ans +=hm.get(arr[i]);
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(int key:hm.keySet()){
            int val=hm.get(key);
            ans += val * (val -1 )/2;//n * n-1/2 it counts all the pair values and adds 
        }
        System.out.println(ans);
    }
}