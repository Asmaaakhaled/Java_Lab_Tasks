
package max;
import java.util.Scanner;

public class Max {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int arr [][]=new int[3][3];
       int max;
            for(int i=0;i<3;i++)
         {
             for(int j=0;j<3;j++)
             {
                 arr[i][j]= input.nextInt();
             }
         }
        max = arr [0][0];
          for(int i=0;i<3;i++)
         {
             for(int j=0;j<3;j++)
             {
                if (arr[i][j]>=max)
                    max=arr[i][j];
             }
         }
         System.out.print("Maximum is "+max);
    }
    
}
