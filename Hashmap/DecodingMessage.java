import java.util.*;
public class DecodingMessage{
   static String key="the quick brown fox jumps over the lazy dog";
    static String message ="vkbs bs t suepuv";
    public static void main(String[]args){
        HashMap <Character,Character> hm=new HashMap <>();
        int temp = 97;
        for(int i =0;i<key.length();i++){
            char ch=key.charAt(i);
            if(ch!= ' '&& !hm.containsKey(ch)){
                //if no key is present then we kep ch and temp to it
                hm.put(ch,(char)temp);//converting temp into char
                temp++;
            }
        }
            String ans ="";
            for(int j=0;j<message.length();j++){
                char ch = message.charAt(j);
                if(ch!=' '){
                    char val = hm.get(ch);
                    ans+= val;
                }
                else{
                    ans+=' ';
                }
            }
        System.out.println(ans);
    }
}