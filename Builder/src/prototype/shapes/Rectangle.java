package prototype.shapes;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(){};

    public Rectangle(Rectangle target){
        super(target);
        if(target != null){
            this.width = target.width;
            this.height = target.height;
        }

    }

    @Override
    public Shape myclone() {
        return new Rectangle(this);
    }
}
