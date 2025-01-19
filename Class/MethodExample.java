class Calculator{
    int add(int a , int b){
        return (a + b);
    }

    int add(int a, int b,int c){
        return (a + b + c);
    }


    double add(double a, double b){
        return(a + b);

    }
}
    public class MethodExample{
        public static void main(String[] args){
            
            Calculator calculator = new Calculator();
            System.out.println("Sum on 10 and 20 is "+calculator.add(10,20)); 
            System.out.println("Sum on 10 and 20 and 30 is "+calculator.add(10,20,30)); 
            System.out.println("Sum on 5.5 and 6.5 is "+calculator.add(5.5,6.5)); 

        }

    }
