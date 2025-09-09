//anagram ante 2 stings vuntai ahh 2 strings loo same characters vunte adhi anagram else not an anagram
//A: 'abcd'
//B: 'dabc'
//it is an anagram

//Q: to find wheather the strings are anagram or not
import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args) {
        
        String[] a={"abcd"};
        String[] b={"dabc"};
        if(a.length != b.length){
            System.out.println("false");
        }
        char[] A= a[0].toCharArray();
        char[] B= b[0].toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);
        int indexA =0;
        int indexB =0;
        int len = A.length;
        while (indexA<len && indexB<len)  {
            if(A[indexA]!=B[indexB]){
                System.out.println("false");
                break;
            }
            indexA++;
            indexB++;
        }
        System.out.println("it is a Anagram");
    }
}
