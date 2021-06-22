public class Square extends Rectangle {

    public Square(double base) {
        super(base,base);
    }

    @Override
    public double calculateArea(){
       return( Math.pow(this.base,2));

    }

    @Override
    public String toString(){
        return("Square:\nBase:" + this.base + "\n");
    }


}
