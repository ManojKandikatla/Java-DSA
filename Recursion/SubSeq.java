import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        // Subseq("", "abc");
        // System.out.println(SubseqUsingArraylist("", "abc"));
        //SubseqAscii("", "abc");
        SubseqAscii("", "abc");
    }
    //p:processed,up:unprocessed
    static void Subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);//taking the first character for every itteration

        Subseq(p+ch, up.substring(1));//left side recurtion adds irst element
        Subseq(p, up.substring(1));//right side recurtion skips first element
    }
    static ArrayList<String> SubseqUsingArraylist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);//taking the first character for every itteration

       ArrayList<String> left = SubseqUsingArraylist(p+ch, up.substring(1));//left side recurtion adds irst element
        ArrayList<String> right = SubseqUsingArraylist(p, up.substring(1));//right side recurtion skips first element

        left.addAll(right);
        return left;
    }


     static void SubseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p+" ");
            return;
        }
        char ch = up.charAt(0);//taking the first character for every itteration

        SubseqAscii(p+ch, up.substring(1));
        SubseqAscii(p, up.substring(1));
        SubseqAscii(p+(ch+0), up.substring(1));//prints ascii values
    }


     static ArrayList<String> SubseqAsciiReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);//taking the first character for every itteration

       ArrayList<String> first = SubseqAsciiReturn(p+ch, up.substring(1));//left side recurtion adds irst element
        ArrayList<String> second = SubseqAsciiReturn(p, up.substring(1));//right side recurtion skips first element
        ArrayList<String> third = SubseqAsciiReturn(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    } 
}