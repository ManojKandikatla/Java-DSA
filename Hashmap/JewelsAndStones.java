import java.util.*;
public class JewelsAndStones{
    public static void main(String[]args){
        String jw = "aA";
        String st = "aAAbbb";

        HashMap <Character,Integer> hm = new HashMap<>();
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int ans=0;
        for(int j=0;j<jw.length();j++){
            char ch = jw.charAt(j);
            if(hm.containsKey(ch)){
                ans+=hm.get(ch);
            }
        }
        System.out.println(ans);
    }
}