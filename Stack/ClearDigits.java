import java.util.*;
public class ClearDigits {
    public static void main(String[] args) {
       Stack<Character> st=new Stack <>(); 
       String s ="aby37bte824bvtw";
       StringBuilder sb= new StringBuilder();

       for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch>='0' && ch<='9'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(ch);
            }
       }

       while (!st.isEmpty()) {
        sb.append(st.pop());//pops from st and srores in sb 
       }
       sb.reverse();
       System.out.println(sb);
    }
}
