import java.util.Scanner;
public class input{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        // float n = obj.nextFloat();
        // System.out.println("The number is "+n);
        // String n1= obj.nextLine();//input string
        // System.out.println(n1);
        //int n =4;
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     int temp = obj.nextInt();
        //     arr[i]=temp;
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // int s = obj.nextInt();
        // String k =obj.nextLine();
        // String n1 = obj.nextLine();
        // System.out.println(s+" "+n1);


        // String[] st = new String[n];
        // for(int i=0;i<st.length;i++){
        //     st[i]=obj.nextLine();
        // }
        // for(int i=0;i<st.length;i++){
        //     System.out.print(st[i]+" ");
        // }
        int n = obj.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(n+ " * "+i+" = "+(n*i));
        }
       obj.close();
    }
}