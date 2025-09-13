public class SkipACharReturn {
    public static void main(String[] args) {
        System.out.println(skip("baccbadca"));
        System.out.println(skipApple("bacappleaah"));
    }
     
//we gona decrease the space complexity here
//skip char
 static String skip(String up){
    if(up.isEmpty()){
        return "";   
    }
    char ch = up.charAt(0);
    if(ch == 'a'){
        return skip(up.substring(1));
        //it will not add
        
    }else{
       return ch+skip(up.substring(1));
       //add
    }
 }

 //skip string
 static String skipApple(String up){
    if(up.isEmpty()){
        return "";   
    }
    if(up.startsWith("apple")){
        return skipApple(up.substring(5));
        //it will not add skips 5 chars
    }else{
       return up.charAt(0)+skipApple(up.substring(1));
       //add
    }
 }
}