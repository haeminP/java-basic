package ref;


import javax.swing.*;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("Tofu", 2000, 2);
        orders[1] = createOrder("Kimchi", 5000, 1);
        orders[2] = createOrder("Coke", 1500, 2);

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
