import java.util.HashMap;

public class FindAnagramsinString {

    public static boolean fun(HashMap <Character,Integer> hms,HashMap <Character,Integer> hmp ){
        if(hms.size()!=hmp.size()){
            return false;
        }
        for(char key:hms.keySet()){
            if(!hmp.containsKey(key)){
                return false;
            }
            int a= hms.get(key);
            int b= hmp.get(key);
            if(a!=b){
                return false;
            }
        }
        return true;
    } 


    public static void main(String[]args){
        String s = "abab";
        String p = "ab";
        /*the question is to check wheater s,p both are equal are not,anagram ante p loo vunnav values s loo unnaya leva ani check cheyali(reverse loo vunna strigth gaa vunna same length loo math aithunaya ledha ani check cheyalii)that is known as anagram */

        int n= s.length();
        int k=p.length();
        int l=0;

        HashMap <Character,Integer> hms= new HashMap<>();
        HashMap <Character,Integer> hmp= new HashMap<>();

        for(int i=0;i<k;i++){
            char ch= p.charAt(i);
            hmp.put(ch,hmp.getOrDefault(ch,0)+1);
        }


        for(int r=0;r<n;r++){
            char ch= s.charAt(r);
            hms.put(ch,hms.getOrDefault(ch,0)+1);

            if(r-l==k){
                char chleft=s.charAt(l);
                hms.put(chleft,hms.get(chleft)-1);
                if(hms.get(chleft)==0){
                    hms.remove(chleft);
                }
                l++;
            }
            if(r-l+1==k){
               boolean valid= fun(hms,hmp);
               if(valid){
                System.out.println(l);
                
               }
            }
        }
    }
}
