public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalCost() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }
 public String toString (){
        return name+" Цена "+price+" Количество "+quantity;
    }
    public static void main(String[] args) {
        Product product = new Product("Ноутбук", 1200.50, 3);
        System.out.println("Товар: " + product.getName());
        System.out.println("Общая стоимость: " + product.totalCost());
        System.out.println(product);
    }
}