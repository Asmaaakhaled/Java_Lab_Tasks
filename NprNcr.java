
package nprncr;

import java.util.Scanner;
public class NprNcr {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      int n= input.nextInt();
      int k= input.nextInt();
      int facta =1, factb = 1,factc=1;
      double npr,ncr;
      for(int i=1;i<=n-k;i++){
       facta *=i;
      }
      for(int j=1;j<=n;j++){
          factb*=j;
      }
      for(int a=1;a<=k;a++){
          factc*=a;
      }
      npr=factb/facta;
      ncr=factb/(facta*factc);
    System.out.println("npr="+npr);
    System.out.println("npr="+ncr);
       
    }
    
}
