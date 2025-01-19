class Circle{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    boolean isEqual(Circle other){
        return this.radius == other.radius;
    }

}

public class ObjectParameter{
    public static void main(String[] args){

        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(9.0);
        System.out.println("c1 is equal to c2 "+c1.isEqual(c2));
        System.out.println("c1 is equal to c3 "+c1.isEqual(c3));
    }
}