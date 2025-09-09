//O(nlogn)tc
//O(1)sc 
import java.util.Arrays;
public class LongestPrefix {
    public static void main(String[] args) {

        String[] strs = { "club", "claps", "clove" };
        String ans =LongestCommonPrefix(strs);
        System.out.println(ans);
    }
    static String LongestCommonPrefix(String[] strs){
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);

        char[] f = strs[0].toCharArray();
        char[] l = strs[strs.length-1].toCharArray();



        for (int i = 0; i < f.length; i++) {
            if (f[i] != l[i]) {
                break;
            }
            result.append(f[i]);
        }
        return result.toString();
    }
}
