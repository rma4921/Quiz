package WeeklyQuiz.java_interface;

public abstract class Product implements Promotion{
    private String name;
    private int price;
    private int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public abstract int getDiscountAmount();

    public int getDiscountedPrice() {
        return this.price - getDiscountAmount();
    }

    public int getWeight() {
        return this.weight;
    }
}
