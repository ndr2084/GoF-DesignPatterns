package prototype.shapes;

public class Circle extends Shape{
    public int radius;

    //needed so you can create instance of the class
    public Circle(){};

    public Circle(Circle target) {
        //sets up the shape with the bare bones attributes
        super(target);
        if (target != null) {
            //adds additional attributes to target
            this.radius = target.radius;
        }
    }
    //this is where prototype design comes into play
    //We are creating a new instance of Circle without having to worry about the shape superclass
    @Override

    //creates an identical but different object
    public Shape myclone() {
        return new Circle(this);
    }
}
