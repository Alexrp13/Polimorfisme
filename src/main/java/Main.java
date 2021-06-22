import java.util.Arrays;
import java.lang.*;


public class Main {

    public static void sum ( Figure[] f ){

        double sum = 0;
        for (Figure a : f) {
            sum = sum + a.calculateArea();
        }
        sum = Math.round(sum*100);
        System.out.println(sum/100);
    }


    public static void sort( Figure[] f ){
        Arrays.sort(f,(a,b) -> Double.compare(a.calculateArea(),b.calculateArea()));
    }



    public static void main ( String[] args ){

        Circle circle = new Circle(2);
        Triangle triangle = new Triangle (2,2);
        Rectangle rectangle = new Rectangle(4,5);
        Square square = new Square(2);

        Figure[] f = { circle, triangle, rectangle, square};

        for (Figure a : f) {
            System.out.println(a.toString());

        }

        sort(f);

        System.out.println("Sorted \n");

        for (Figure a : f) {
            System.out.println(a.toString());
        }


        sum (f);


    }
}
