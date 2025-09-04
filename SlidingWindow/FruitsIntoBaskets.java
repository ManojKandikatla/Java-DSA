import java.util.*;
public class FruitsIntoBaskets {
    public static void main(String[]args){
        int[] fruits={1,2,1,0,1,0,0,0};
        int n=fruits.length;
        int l=0;
        int ans=0;
        int k=2;
        HashMap <Integer,Integer> hm= new HashMap<>();
        for(int r=0;r<n;r++){
            hm.put(fruits[r],hm.getOrDefault(hm,0)+1);
            while(hm.size()>k){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}
