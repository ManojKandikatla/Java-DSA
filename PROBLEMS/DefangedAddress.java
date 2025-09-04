public class DefangedAddress{
    public static void main(String[]args){
       String address = ".1.1.1.1.1.1";
       String ans ="";
        for(int i=0;i<address.length();i++){
            char value = address.charAt(i);
            if(value=='.'){
                ans = ans+"[.]";
            }
            else{
                ans=ans +value;
            }
        }
            System.out.println(ans);
    }
}