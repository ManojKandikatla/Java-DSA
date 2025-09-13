import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        //a string will be given so we need to re-arrange it
        //[abc]:[abc,bac,cab,bca,acb]
        //subsets are used here processed and unprocessed 
        permutations("", "abc");
        System.out.println(permutationArrayList("", "abc"));
    }
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f= p.substring(0, i);
            String s= p.substring(i, p.length());
            permutations(f+ch+s, up.substring(1));
        }
    }
    
    static ArrayList <String> permutationArrayList(String p,String up){
        if(up.isEmpty()){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
            
        }
        char ch = up.charAt(0);

        ArrayList <String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f= p.substring(0, i);
            String s= p.substring(i, p.length());
           ans.addAll(permutationArrayList(f+ch+s, up.substring(1))) ;
        }
        return ans;
    }
}