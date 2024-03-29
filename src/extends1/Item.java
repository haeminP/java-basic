package extends1;

public class Item {
    public String name;
    public int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    public void print() {
        System.out.println("Name: " + name + ", Price: " + price);
    }
}
