package ref;


import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter order quantity: ");
        int orderQuantity = scnr.nextInt();
        scnr.nextLine();

        ProductOrder[] orders = new ProductOrder[orderQuantity];

        for (int i = 0; i < orderQuantity; i++){
            System.out.printf("Enter order %d's info:\n", i+1);
            System.out.print("Product name: ");
            String productName = scnr.nextLine();

            System.out.print("Price: ");
            int price = scnr.nextInt();

            System.out.print("Quantity: ");
            int quantity = scnr.nextInt();
            scnr.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("Total price: " + totalAmount);
    }
    static ProductOrder createOrder(String productName, int price, int quantity){

        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;

        return product;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder product: orders){
            System.out.printf("Product: %s, Price: %d, Quantity: %d\n", product.productName, product.price, product.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int total = 0;
        for (ProductOrder product: orders){
            total += (product.price * product.quantity);
        }

        return total;
    }

}
