import java.util.*;
public class ValidParentheses {

    public static boolean isValid(String s){
        Stack <Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('|| ch=='{'|| ch=='['){
                st.push(ch);
            }else{
            //     if (st.isEmpty()) {
            //         return false;
            //     }
            //     int top = st.pop();
            //   if(ch==']'){
            //     if(top!='['){
            //         return false;
            //     }
            //   }  
            //   if(ch=='}'){
            //     if(top!='{'){
            //         return false;
            //     }
            //   }  
            //   if(ch==')'){
            //     if(top!='('){
            //         return false;
            //     }
            //   }  
            if(st.isEmpty()){
                return false;
            }
            if((ch == ')' && st.peek()=='(')||(ch == '}' && st.peek()=='{')||(ch == ']' && st.peek()=='[')){
                st.pop();
            }else{
                return false;
            }
            }
        }
        // if(st.isEmpty()){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s="({}[]{}){}[]";
       boolean ans =isValid(s);
       System.out.println(ans);
    }
}