
package circle;

public class Cylinder extends Circle {
    private double height,volume;
    public Cylinder(){
        System.out.println("No prameter constructor");
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radious) {
        super(radious);
        this.height = height;
    }

    public Cylinder(double height, double radious, String color) {
        super(radious, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + '}';
    }

    public double getVolume() {
        volume=getArea()*height;
        return volume;
    }

    
    
    
}
