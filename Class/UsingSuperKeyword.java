class Vechile{
    String name="Vechile";
    void display(){
        System.out.println("This is a  "+ name);
    }
}


class Car extends Vechile{
    String name="Car";
    void display(){
        super.display();
        System.out.println("This is a "+ name);
    }
}

public class UsingSuperKeyword{
    public static void main(String[] args){
        Car car = new Car();
        car.display();
    }
}