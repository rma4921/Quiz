package WeeklyQuiz.java_interface;

public class Grocery extends Product {
    // 명세에 따라 따로 구현. 추후 Product에 합쳐보기
    private int discount;

    public Grocery(String name, int price, int weight) {
        super(name, price, weight);
        this.discount = 2000;
    }
    public Grocery(String name, int price, int weight, int discount) {
        super(name, price, weight);
        this.discount = discount;
    }

    @Override
    public int getDiscountAmount() {
        return this.discount;
    }
}