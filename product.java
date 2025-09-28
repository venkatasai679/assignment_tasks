class Product1{
    private int prod_id;
    private String prod_name;
    private double price;
    private int quantity_on_hand;

    public Product1(int prod_id, String prod_name, double price, int quantity_on_hand) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        this.quantity_on_hand = quantity_on_hand;
    }

    public double getNetPrice() {
        return price + (price * 0.12);
    }

    public void purchase(int qty) {
        quantity_on_hand += qty;
    }

    public void sell(int qty) {
        if (qty <= quantity_on_hand) {
            quantity_on_hand -= qty;
        } else {
            System.out.println("Not enough stock available!");
        }
    }

    public void display() {
        System.out.println("ID: " + prod_id + " Name: " + prod_name +
                " Price: " + price + " Stock: " + quantity_on_hand);
    }
}
class product{
    public static void main(String[] args) {
        Product1 p=new Product1(11,"sample",12.16,11);
        p.display();
    }
}
