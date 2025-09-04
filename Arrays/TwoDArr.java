public class TwoDArr{
    public static void main(String[]args){
        int[][] arr ={{2,3,5},{6,7,9}};
        int r=arr.length;
        int c=arr[0].length;
        
        for(int i=0;i<r;i++){
            int j = c-i-1;
           System.out.println(arr[i][j]);
        }
        System.out.println(arr[0][1]);
        
        System.out.println("rows:-"+r+" columns-"+c);
    }
}
 