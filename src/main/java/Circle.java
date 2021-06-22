import java.lang.*;

public class Circle extends Figure {
    private double radius;


    public double getRadius(){
        return  this.radius;
    }

    public void setRadius( double radius){
        this.radius = radius;

    }

    public Circle ( double radius){
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius,2));
    }
    @Override
    public String toString(){
        return("Circle:\nRadius:" + this.radius + "\n");
    }
}
