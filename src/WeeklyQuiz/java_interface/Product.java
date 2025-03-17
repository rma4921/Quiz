package WeeklyQuiz.java_interface;

import java.math.BigDecimal;

public abstract class Product implements Promotion{
    private String name;
    private BigDecimal price;
    private double weight;

    public Product(String name, BigDecimal price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public abstract BigDecimal getDiscountAmount();

    public BigDecimal getDiscountedPrice() {
        return this.price.subtract(getDiscountAmount());
    }
    public double getWeight() {
        return this.weight;
    }
}
