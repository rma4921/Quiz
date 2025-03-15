package WeeklyQuiz.java_interface;

import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
    BigDecimal getDeliveryCharge(int weight, BigDecimal price);
}
