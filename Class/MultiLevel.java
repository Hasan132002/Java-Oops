class GrandParent{
    void display(){
        System.out.println("GrandParent");
    }
}

class Parent extends GrandParent{
    void show(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void introduce(){
        System.out.println("Child");
    }
}
public class MultiLevel{
    public static void main(String[] args){
        Child child = new Child();
        child.display();
        child.show();
        child.introduce();

    }
}