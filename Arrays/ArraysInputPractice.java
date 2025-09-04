import java.util.*;
import java.util.Arrays;
public class ArraysInputPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = new String[4];//declareing the size of an array

        for(int i =0; i< str.length;i++){
            str[i] = in.next();//next takes string as a input
        }
        System.out.println(Arrays.toString(str));//it behaves like a loop and prints all the elements
        in.close();
    }
} 