public class Rectangle extends Figure{

    public double base;
    public double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle (double base, double height){
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() { return base*height;
    }

    @Override
    public String toString(){
        return("Rectanlge:\nBase:" + this.base + "\nHeight:"+this.height);
    }
}
