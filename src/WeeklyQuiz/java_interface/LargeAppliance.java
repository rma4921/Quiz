package WeeklyQuiz.java_interface;

import java.math.BigDecimal;

public class LargeAppliance extends Product {
    // 명세에 따라 따로 구현. 추후 Product에 합쳐보기
    private BigDecimal discount;

    public LargeAppliance(String name, BigDecimal price, double weight) {
        super(name, price, weight);
        this.discount = new BigDecimal(0);
    }
    public LargeAppliance(String name, BigDecimal price, double weight, BigDecimal discount) {
        super(name, price, weight);
        this.discount = discount;
    }

    @Override
    public BigDecimal getDiscountAmount() {
        return this.discount;
    }
}
