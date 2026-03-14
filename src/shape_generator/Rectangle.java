package shape_generator;

public class Rectangle implements IShapes{

    private double kisa;
    private double uzun;

    public Rectangle(double kisa, double uzun){
        this.kisa = kisa;
        this.uzun = uzun;
    }

    @Override
    public double getArea() {
        return kisa*uzun;
    }

    @Override
    public double getPerimeter() {
        return (kisa+uzun) * 2;
    }

    @Override
    public void getVolume() {
        System.out.println("Shape: Rectangle\n"+
                "Area: " + this.getArea()+
                "\nPerimeter:  " + this.getPerimeter() );
    }
}
