public class Strings{
    public static void main(String[] args) {
        String Thop = "Manojkumar";
        int manoj = 1;
        System.out.println(Thop);
        System.out.println(manoj);
        System.out.println(Thop.charAt(0));
        System.out.println(Thop.charAt(7));
        int a='a';//if we convert char to int it stores ascii value

        //we can only play with int and char to get ascii values
        int b='b';
        char c=97;//stores char of 97 i.e a
        System.out.println(b-a);
        System.out.println('b'-'a');//same in wrote in single line
        System.out.println('b'+'a');//same in wrote in single line
        System.out.println(c);

        //absolute difference
        //int temp=1-2;
        // if(temp<0){
            // temp = temp * -1;
        // }
        // System.out.println(temp);
        // System.out.println(temp);
        int temp=Math.abs(4-10);//math.abs converts negative into positive it is called adsolute difference
         System.out.println(temp);

    }
}