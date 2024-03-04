package access;

public class Item {
    private String name;
    private int price;
    private int quantities;

    public Item(String name, int price, int quantities){
        this.name = name;
        this.price = price;
        this.quantities = quantities;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantities;
    }
}
