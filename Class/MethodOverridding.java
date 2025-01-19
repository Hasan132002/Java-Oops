class Parent{
    void show(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    // @Override
    void show(){
        System.out.println("Child");
    }
}
//dynamic dispatch

public class MethodOverridding{
    public static void main(String[] args){
        Child obj = new Child(); //parent reference child object
        obj.show();
}
}