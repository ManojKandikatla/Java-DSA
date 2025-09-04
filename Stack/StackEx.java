import java.util.*;
public class StackEx {
    public static void main(String[] args) {
        //LIFO
        Stack <String> st = new Stack<>();
        st.push("apple");
        st.push("doll");
        st.push("pillow");
        st.push("pillow");
        st.push("car");
        st.pop();//deletes the last element
        System.out.println(st);
        System.out.println(st.isEmpty());
    }
}
