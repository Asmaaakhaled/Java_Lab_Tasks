
package circle;

public class Circle {
 private double radious,area;
 private String color;
 public Circle(){
     System.out.println("No prameter constructor");
 }

    public Circle(double radious) {
        this.radious = radious;
    }

    public Circle(double radious, String color) {
        this.radious = radious;
        this.color = color;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        area=3.14*radious*radious;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" + "radious=" + radious + ", area=" + area + ", color=" + color + '}';
    }
 
}
