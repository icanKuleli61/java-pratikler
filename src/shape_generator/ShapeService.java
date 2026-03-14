package shape_generator;

public class ShapeService {

    private final IShapes shapes;
    public ShapeService(IShapes shapes){
        this.shapes = shapes;
        shapes.getVolume();

    }


}
