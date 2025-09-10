public class Banana {
    public static void main(String[] args) {
        String name ="banana";
        String result ="";
        int n= 0;
        int count=0;
        while (name.length() > n) {
            char ans = name.charAt(n);
           if(ans=='a'){
            count++;
            if(count==1){
                result +="@";
            }
           else if(count == 2) {
             result +="%";
           }
            else if(count == 3) {
             result +="#";
           }
        }
        n++;
        if(ans=='a'){
            continue;
        }
        result+=ans;
        }
        System.out.println(result);
    }
}
