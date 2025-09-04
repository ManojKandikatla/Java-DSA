import java.util.*;
public class BaseBallGame {
    public static void main(String[] args) {
        String[] ops ={"5","2","C","D","+"};
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<ops.length;i++){
            String s= ops[i];
            if(s.equals("+")){
                int to =st.pop();
                int to2=st.peek();
                int tempAns=to+to2;
                st.push(to);
                st.push(tempAns);
            }
            else if(s.equals("D")){
                int to = st.peek();
                st.push(to * 2);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.valueOf(s));//int.valof converts string into int
            }
        }
        int ans=0;
        for(int i:st){
            ans+=i;
        }
        System.out.println(ans);
    }
}
