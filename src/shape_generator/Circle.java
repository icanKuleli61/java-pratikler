package shape_generator;

import java.awt.*;

public class Circle implements IShapes {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void getVolume() {
        System.out.println("Shape: Circle\n"+
                "Area: " + this.getArea()+
                "\nPerimeter:  " + this.getPerimeter() );
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
