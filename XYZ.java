import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five product information from user and store in an array
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter PID for product " + (i + 1) + ": ");
            int pid = scanner.nextInt();
            System.out.print("Enter price for product " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity for product " + (i + 1) + ": ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find PID of the product with the highest price
        int maxPricePid = findMaxPricePid(products);
        System.out.println("PID of the product with the highest price: " + maxPricePid);

        // Calculate and return the total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }

    // Method to find PID of the product with the highest price
    public static int findMaxPricePid(Product[] products) {
        double maxPrice = products[0].getPrice();
        int maxPricePid = products[0].getPid();

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > maxPrice) {
                maxPrice = products[i].getPrice();
                maxPricePid = products[i].getPid();
            }
        }

        return maxPricePid;
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }

        return totalAmount;
    }
}
