class Groceries extends Product {
    String expiryDate;
    Groceries(String name,double price, int quantity,String expiryDate){
        super(name, price, quantity);
        this.expiryDate = expiryDate;
}
    @Override
    void DisplayProductDetails(){
        System.out.println("Groceries Details:");
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Expiry Date: "+expiryDate);
    }
}