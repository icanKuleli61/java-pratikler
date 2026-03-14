package shape_generator;

public class Triangle implements IShapes{

    private double a, b, c;

    public Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public double getArea() {
        double u = (a + b + c) / 2.0;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        return alan;
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public void getVolume() {
        System.out.println("Shape: Triangle\n"+
                "Area: " + this.getArea()+
                "\nPerimeter:  " + this.getPerimeter() );
    }
}
