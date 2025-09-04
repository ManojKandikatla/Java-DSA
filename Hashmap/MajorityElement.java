import java.util.*;
public class MajorityElement{
    public static void main(String[]args){
        int[] nums={3,2,3,2,2,1,1,1,1,1,1};
        HashMap <Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        int ans =0;
        int n = nums.length/2;
        for(int keys:hm.keySet()){
            if(hm.get(keys)>=n){
                ans = keys;
                System.out.println(ans);
                break;
            }
        }

        // Arrays.sort(nums);
        // int Half= nums.length/2;
        // System.out.println(nums[Half]);
    }
}