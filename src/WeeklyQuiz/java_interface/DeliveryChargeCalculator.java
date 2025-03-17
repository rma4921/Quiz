package WeeklyQuiz.java_interface;

import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
    BigDecimal getDeliveryCharge(double weight, BigDecimal price);
}
