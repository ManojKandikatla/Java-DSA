public class Palindrome{
    public static void main(String[] args){
        String s= "12121";
        boolean palindrome =true;
        int n=s.length();
        //String ans ="";
        // for(int i=s.length()-1;i>=0;i--){
            // ans =ans + s.charAt(i);
        // }
        // if(ans.equals(s)){
            // System.out.println("its a palindrome");
            // System.out.println(ans);
        // }else{
            // System.out.println("Not a palindrome");
            // System.out.println(ans);
        // }
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1)){
                palindrome=false;
                break;
            }
        }
        if(palindrome){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}