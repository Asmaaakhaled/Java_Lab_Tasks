
package areacircomference;

public class Triangle {
    
    public double l1,l2,b,h;
    private double area,circumference;
public void area(){
    area=0.5*b*h;
    System.out.println(area);
}
public void circumference(){
circumference=l1+l2+b;
System.out.println(circumference);
}
}
