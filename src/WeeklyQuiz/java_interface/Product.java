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

    // 굳이 사용하지 않아도 됨. abstract 클래스이기에 인터페이스의 요소를 자식이 구현하면됨.
    public abstract BigDecimal getDiscountAmount();

    public BigDecimal getDiscountedPrice() {
        return this.price.subtract(getDiscountAmount());
    }
    public double getWeight() {
        return this.weight;
    }
}
