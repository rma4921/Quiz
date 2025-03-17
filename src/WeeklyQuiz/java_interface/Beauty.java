package WeeklyQuiz.java_interface;

import java.math.BigDecimal;

public class Beauty extends Product {
    // 명세에 따라 따로 구현. 추후 Product에 합쳐보기
    private BigDecimal discount;

    public Beauty(String name, BigDecimal price, double weight) {
        super(name, price, weight);
        discount = new BigDecimal(10000); // BigDecimal.valueOf(10000) 이 더 자주 사용됨.
    }
    public Beauty(String name, BigDecimal price, double weight, BigDecimal discount) {
        super(name, price, weight);
        this.discount = discount;
    }

    @Override
    public BigDecimal getDiscountAmount() {
        return this.discount;
    }
}