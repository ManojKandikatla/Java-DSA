import java.util.*;
public class Patterns{
    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);
       int row = obj.nextInt();
       //int column =7;
        // for(int i=0;i<5;i++)//row
        // {
        //     for(int j=0;j<6;j++)//column
        //     {
        //         System.out.print("*");
        //         if(j!=5){
        //             System.out.print(" ");//it avoids space for last index
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<column;j++)
        //     {
        //         System.out.print("*");
        //         if(j!=column-1){
        //             System.out.print(" ");//it avoids space for last index
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<column;j++)
        //     {
        //         if(i==0||i==row-1||j==0||j==column-1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");

        //         }
        //         // if(j!=column-1){
        //         //     System.out.print(" ");//it avoids space for last index
        //         // }
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<column;j++)
        //     {
        //         if(i==0||i==row-1||j==0||j==column-1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");

        //         }
        //         // if(j!=column-1){
        //         //     System.out.print(" ");//it avoids space for last index
        //         // }
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<column-i;j++)//based on i it gives space
        //     {
        //             System.out.print("*");

        //         // if(j!=column-1){
        //         //     System.out.print(" ");//it avoids space for last index
        //         // }
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<column-i;j++)//based on i it gives space
        //         {
        //         System.out.print(" ");
        //     }
        //         for(int k=0;k<4;k++){
        //         System.out.print("*");
        //         }
        //     System.out.println();
        // }

        // for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<row-i-1;j++)//based on i it gives space
        //         {
        //         System.out.print(" ");
        //     }
        //         for(int k=0;k<2*i+1;k++){
        //         System.out.print("*");
        //         }
        //     System.out.println();
        // }

        // for(int i=row-1;i>=0;i--)
        // {

        //     for(int j=0;j<row-i-1;j++)//based on i it gives space
        //         {
        //         System.out.print(" ");
        //     }
        //         for(int k=0;k<2*i+1;k++){
        //         System.out.print("*");
        //         }
        //     System.out.println();
        // }

        
        //  for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<row-i-1;j++)
        //         {
        //         System.out.print(" ");
        //     }
        //         for(int k=0;k<2*i+1;k++){
        //         System.out.print("*");
        //         }
        //     System.out.println();
        // }
        // for(int i=row-2;i>=0;i--)
        // {
        //     for(int j=0;j<row-i-1;j++)
        //         {
        //         System.out.print(" ");
        //     }
        //         for(int k=0;k<2*i+1;k++){
        //         System.out.print("*");
        //         }
        //     System.out.println();
        // }

        // for(int i=row-2;i>=0;i--)
        // {
        //     for(int j=0;j<row-i-1;j++)
        //         {
        //         System.out.print(" ");
        //     }
        //         for(int k=0;k<2*i+1;k++){
        //         System.out.print("*");
        //         }
        //     System.out.println();
        // }
        
        //  for(int i=1;i<row;i++)
        // {
        //     for(int j=0;j<row-i-1;j++)
        //         {
        //         System.out.print(" ");
        //     }
        //         for(int k=0;k<2*i+1;k++){
        //         System.out.print("*");
        //         }
        //     System.out.println();
        // }
        
        //  for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<row-i-1;j++)
        //         {
        //         System.out.print(" ");
        //     }
        //         for(int k=0;k<2*i+1;k++){
        //             if(i==row-1 || k==0|| k==2*i){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //     System.out.println();
        // }
        
        //  for(int i=row-1;i>=0;i--)
        // {
        //     for(int j=0;j<row-i-1;j++)
        //         {
        //         System.out.print(" ");
        //     }
        //         for(int k=0;k<2*i+1;k++){
        //             if(i==row-1 || k==0|| k==2*i){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //     System.out.println();
        // }
        
        //  for(int i=0;i<row-1;i++)
        // {
        //     for(int j=0;j<row-i-1;j++)
        //         {
        //         System.out.print(" ");
        //     }
        //         for(int k=0;k<2*i+1;k++){
        //             if( k==0|| k==2*i){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //     System.out.println();
        // }
        //  for(int i=row-1;i>=0;i--)
        // {
        //     for(int j=0;j<row-i-1;j++)
        //         {
        //         System.out.print(" ");
        //     }
        //         for(int k=0;k<2*i+1;k++){
        //             if(k==0|| k==2*i){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //     System.out.println();
        // }


        //number pattern

        // for(int i=0;i<row;i++){
        //     for(int j=1;j<=i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<row;i++){
        //     for(int j=0;j<2*(row-i-1);j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=i;k>=0;k--){
        //         System.out.print((k+1)+" ");
        //     }
        //     System.out.println();
        // }
        

        // for(int i=0;i<row;i++){
        //     for(int j=0;j<row-i-1;j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=i;k>=0;k--){
        //         System.out.print((k+1)+" ");
        //     }
        //     for(int j=2;j<=i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
          for(int i =0;i<row;i++){
            for(int j=0;j<row-i-1;j++){
                System.out.print("  ");
            }
            for(int k=i;k>=0;k--){
                System.out.print((k+1)+" ");
            }
            System.out.println();
        }
        obj.close();
    }

}
