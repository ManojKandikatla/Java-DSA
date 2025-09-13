public class SkipAChar {
 public static void main(String[] args) {
    skip("", "baccdadh");

 }   
 //p: process up:unprocess
//up ante original array,p ante copy of up
 static void skip(String p, String up){
    if(up.isEmpty()){
        System.out.println(p);
        return;
        //up empty aithe p ni return chestham
    }
    char ch = up.charAt(0);
    if(ch == 'a'){
        skip(p, up.substring(1));
        //up == a aithe skip cheyali p loo add cheyadhu
    }else{
        skip(p+ch, up.substring(1));
        //up is not equal to a aithe up ni p loo add cheyalii 
    }
 }
}