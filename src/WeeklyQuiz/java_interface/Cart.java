package WeeklyQuiz.java_interface;

import java.math.BigDecimal;

class Cart {
    private Product[] products;
    private GetDeliveryCharge calculator;

    public Cart(Product[] products) {
        this.products = products;
        this.calculator = new GetDeliveryCharge();
    }

    public BigDecimal calculateDeliveryCharge() {
        double totalWeight = 0.0;
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product : products) {
            totalWeight += product.getWeight();
            totalPrice = totalPrice.add(product.getDiscountedPrice());
        }

        return calculator.getDeliveryCharge(totalWeight, totalPrice);
    }
}
