package access;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if (itemCount >= items.length) {
            System.out.println("Shopping cart is full. Cannot add more items");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("Shopping cart items");
        for (int i = 0; i < itemCount; i++){
            Item item = items[i];
            System.out.println("Name: " + item.getName() + ", Total: " + item.getTotalPrice());
        }

        System.out.println("Shopping cart total: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int total = 0;
        for (int i = 0; i < itemCount; i++){
            Item item = items[i];
            total += item.getTotalPrice();
        }

        return total;
    }
}
