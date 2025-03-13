package WeeklyQuiz.java_interface;

public class LargeAppliance extends Product {
    // 명세에 따라 따로 구현. 추후 Product에 합쳐보기
    private int discount;

    public LargeAppliance(String name, int price, int weight) {
        super(name, price, weight);
        this.discount = 0;
    }
    public LargeAppliance(String name, int price, int weight, int discount) {
        super(name, price, weight);
        this.discount = discount;
    }

    @Override
    public int getDiscountAmount() {
        return this.discount;
    }
}
