class Employee{
    String name;

    Employee(String name) {
        this.name = name;

    }

    void display(){
        System.out.println("Employee name : "+ name);
    }
}

public class ThisKeywordExample{
    public static void main(String[] args){
        Employee employee = new Employee("Ali");
        employee.display();
    }
}
