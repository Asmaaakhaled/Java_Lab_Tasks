
package transpose;
import java.util.Scanner;

public class Transpose {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int x[][]= new int[2][3];
      int y[][]= new int[3][2];
      System.out.println("enter the numbers of the matrix");
      for(int i=0;i<2;i++)
         {
             for(int j=0;j<3;j++)
             {
                 x[i][j]= input.nextInt();
             }
         }
      for(int i=0;i<2;i++)
         {
             for(int j=0;j<3;j++)
             {
                   System.out.print(x[i][j]+"");
  
             }
             System.out.println();
         }
      for(int i=0;i<3;i++)
         {
             for(int j=0;j<2;j++)
             {
                 y[i][j]=x[j][i];
                   System.out.print(y[i][j]+"");
  
             }
             System.out.println();
         }
    }
    
}
