
package circle;

public class Main {

    
    public static void main(String[] args) {
Circle obj1= new Circle();
obj1.setColor("red");
        System.out.println(obj1.getColor());
        obj1.setRadious(1.0);
        System.out.println(obj1.getArea());
        System.out.println(obj1.toString());
        Cylinder obj2=new Cylinder();
        obj2.setHeight(1.0);
        obj2.setRadious(1.0);
        System.out.println(obj2.getVolume()); 
        System.out.println(obj2.toString()); 

    }
    
}
