public class ScoreOfString{

    public static void main(String[] args){
        //sum of ascii values with absolute values(|Mod|)
        String s="zaz";
        int temp =0;
        for(int i=0;i<s.length()-1;i++){
            char c = s.charAt(i);
            char cnext = s.charAt(i+1);
            int value = c;
            int valuenext = cnext;
            //System.out.println(value);
            //System.out.println(valuenext);
            int ans = Math.abs(value - valuenext);
            //System.out.println(ans);
            temp += ans; 

           // System.out.println(i+ " "+(i+1));
        }
            System.out.println(temp);
    }
}