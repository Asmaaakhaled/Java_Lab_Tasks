
package areacircomference;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
        Circle obj1=new Circle();
        obj1.d=input.nextDouble();
        obj1.area();
        obj1.circomference();
        
        Triangle obj2=new Triangle();
        obj2.l1=input.nextDouble();
        obj2.l2=input.nextDouble();
        obj2.b=input.nextDouble();
        obj2.h=input.nextDouble();
        obj2.area();
        obj2.circumference();
    }
    
}
