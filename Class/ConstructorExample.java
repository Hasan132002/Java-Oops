class Student{
    String name;
    int age;

    Student(){
        this.name = "UnknowStudent";
        this.age = 0;
    }

    Student(String name){
        this.name = name;
        this.age = age;

    }
    void display(){
        System.out.println("Name: " + name + " age: " + age);
    }
}
public class ConstructorExample{
    public static void main(String[] args){
        
        Student studentOne = new Student();
        studentOne.display();

        Student studentTwo = new Student("Hasan");
        studentTwo.display();



    }
}