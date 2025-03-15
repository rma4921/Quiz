package WeeklyQuiz.java_interface;

import java.math.BigDecimal;

class GetDeliveryCharge implements DeliveryChargeCalculator {
    @Override
    public BigDecimal getDeliveryCharge(int weight, BigDecimal price) {
        BigDecimal deliveryCharge;

        if (weight < 3) {
            deliveryCharge = new BigDecimal("1000");
        } else if (weight < 10) {
            deliveryCharge = new BigDecimal("5000");
        } else {
            deliveryCharge = new BigDecimal("10000");
        }

        if (price.compareTo(new BigDecimal("30000")) <= 0) {
            return deliveryCharge;
        } else if (price.compareTo(new BigDecimal("100000")) < 0) {
            return deliveryCharge.subtract(new BigDecimal("1000"));
        } else {
            return BigDecimal.ZERO;
        }
    }
}