package WeeklyQuiz.java_interface;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;

        for (Product product : products) {
            totalWeight += product.getWeight();
            totalPrice += product.getDiscountedPrice();
        }

        int deliveryCharge;
        if (totalWeight < 3) {
            deliveryCharge = 1000;
        } else if (totalWeight < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }

        if (totalPrice <= 30000) {
            return deliveryCharge;
        } else if (totalPrice < 100000) {
            return deliveryCharge - 1000;
        } else {
            return 0;
        }
    }
}
