import java.util.*;

public class LongStringWithoutRepeatingChar {
    public static void main(String[]args){
        String s="abcabcbb";
        int n=s.length();
        int l=0;
        int ans=0;
        HashSet <Character> hm= new HashSet<>();
        for(int r=0;r<n;r++){
            char ch= s.charAt(r);
            if(!hm.contains(ch)){
                hm.add(ch);
            }
            else{
                while (hm.contains(ch)) {
                    hm.remove(s.charAt(l));//r==l aiyedhaka l ni delete chesukunta vachi l ni kuda delete chesi l increment chestham r ni hm loo add chestham
                    l++;
                }
                hm.add(ch);//r value ni add chesthunam
            }
            ans=Math.max(r-l+1,ans);
        }
        System.out.println(ans);
    }
}
