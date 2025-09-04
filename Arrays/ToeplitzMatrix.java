public  class ToeplitzMatrix{
    public static boolean validfun(int[][]matrix,int y,int x){
        int r=matrix.length;
        int c=matrix[0].length;
        int i=y;
        int j=x;
        int temp=matrix[i][j];
        boolean valid=true;
        while(i<r && j<c) {
            if(matrix[i][j]!=temp){
                valid =false;
                break;
            }
            i++;
            j++;
        }
        return valid;
    }
    public static void main(String[]args){
        int[][] matrix ={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int r = matrix.length;
        int c =matrix[0].length;
        boolean ans=true;
        for(int j=0;j<c;j++){
            //matrix[0][j];
             boolean temp =  validfun(matrix,0,j);
            if(temp == false){
                ans = false;
            }
        }
        for(int i=1;i<r;i++){
            //matrix[i][0];
             boolean temp =  validfun(matrix,i,0);
               if(temp == false){
                ans = false;
            }
        }
        System.out.println(ans);
    }
}