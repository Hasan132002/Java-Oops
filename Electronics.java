
class Electronics extends Product{
    String brand;
    Electronics(String name,double price, int quantity,String brand){
        super(name, price, quantity);
        this.brand = brand;

    }
    @Override
    void DisplayProductDetails(){
        System.out.println("Electronics Details:");
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Brand: "+brand);
    }

}