package Class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder product1 = new ProductOrder();
        ProductOrder product2 = new ProductOrder();
        ProductOrder product3 = new ProductOrder();

        ProductOrder[] products = {product1, product2, product3};

        product1.productName = "Tofu";
        product1.price = 2000;
        product1.quantity = 3;

        product2.productName = "Kimchi";
        product2.price = 5000;
        product2.quantity = 1;

        product3.productName = "Coke";
        product3.price = 1500;
        product3.quantity = 2;

        int total = 0;

        for (ProductOrder product: products){
            System.out.printf("Product: %s, Price: %d, Quantity: %d\n", product.productName, product.price, product.quantity);
            total += (product.price * product.quantity);
        }

        System.out.println("Total price: " + total);

    }
}
