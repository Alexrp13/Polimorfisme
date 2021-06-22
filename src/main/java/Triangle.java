public class Triangle extends Figure{

    private double base;
    private double height;

    public double getBase(){
        return this.base;

    }

    public double getHeight(){
        return this.height;

    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setBase(double base){
        this.base = base;
    }

    public Triangle( double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override
    public double  calculateArea() {
        return( this.base * this.height / 2);
    }

    @Override
    public String toString(){
        return("Triangle:\nBase:" + this.base + "\nHeight:"+this.height +"\n");
    }
}
