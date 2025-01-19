import java.util.Scanner;

public class InventoryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] inventory = new Product[5];
        inventory[0] = new Electronics("Laptop",100.0,5,"Dell");
        inventory[1] = new Groceries("Milk",2.5,100,"01/01/2022");
        inventory[2] = new Electronics("Mobile",500.0,20,"App");

        System.out.println("Product Inventory:");
        displayInventory(inventory);
        System.out.println("Enter the name of the product to check Avaialbility");
        String productName = scanner.nextLine();
        checkProductAvalibility(inventory, productName);
        scanner.close();

    }
    static void displayInventory(Product[] inventory){
        System.out.println("Inventory Details");
        for(Product product : inventory){
            product.DisplayProductDetails();
        }

    }

    static void checkProductAvalibility(Product[] inventory,String productName){
        boolean found = false;
        for(Product product : inventory){
            if(product.name.equalsIgnoreCase(productName)){
                found = true;
                product.DisplayProductDetails();
                break;
            }
        }
        if(!found){
            System.out.println("Product not found in inventory");
        }

    }

}