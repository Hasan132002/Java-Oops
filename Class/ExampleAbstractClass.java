abstract class Shape
{
    abstract void draw();    //abstratc method
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }
}
public class ExampleAbstractClass{
    public static void main(String[] args){
        Shape shape = new Circle(); //upcasting
        shape.draw();
    }   
}