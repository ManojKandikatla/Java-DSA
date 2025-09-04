import java.util.*;
public class MaxNestingDeptOfParentheses {

    public static void main(String[] args) {
        //question enti ante maximum nesting dept enno chppali ex:((((8)))) ans= 4 ex: (1)+((2))+(((3))) ans=3
        String s="(1+(2+3)+((8)/4))+1";
        Stack <Character> st= new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='('){
                st.push('(');
            }else if(ch==')'){
                st.pop();
            }
            ans=Math.max(ans,st.size());
        }
        System.out.println(ans);
    }
}