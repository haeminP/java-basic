package access;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("bread", 10, 2);
        Item item2 = new Item("apple", 3, 6);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
