import java.util.*;
public class SubStringsSize3 {
    // public static boolean fun(String s,int k){
    //     HashSet <Character> hs= new HashSet<>();
    //     //hashset only adds unique values
        // for(int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //         hs.add(ch);
    //     }
    //     if(hs.size()==k){
    //         return true;
    //     }else{
    //        return false; 
    //     }
    // }
    public static void main(String[]args){
        //optimizing into O(n)
        int ans=0;
        String s="abcadd";
        int k=3;
        int l=0;
        HashMap <Character,Integer> hm= new HashMap<>();
         for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(i-l==k){
                char tch = s.charAt(l);
                hm.put(tch,hm.get(tch)-1);
                if(hm.get(tch)==0){
                    hm.remove(tch);
                }
                l++;
            }
            if(hm.size()==k){
                ans+=1;
            }   
        }
        System.out.println(ans);

    //     for(int i=0;i<n-k+1;i++){
    //         //System.out.println(i+" "+(i+3));
    //        boolean temp= fun(s.substring(i,i+k),k);
    //        if(temp){
    //         ans+=1;
    //        }
    //     }
    //     System.out.println(ans);//O(n**3)
    }

}
