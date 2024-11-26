package prototype.shapes;

public abstract class Shape {
    //instance methods are given to any class that extends the superclass
    public int x;
    public int y;
    public String colour;

    public Shape(){}

    //copy constructor
    public Shape(Shape target){
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.colour = target.colour;
        }
    }

    public abstract Shape myclone();
}
