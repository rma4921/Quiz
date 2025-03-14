package DailyQuiz._0314.Quiz;

public class TwoContainer <T, B> {
    private T key;
    private B value;

    public void set(T key, B value) {
        this.key = key;
        this.value = value;
    }
    public T getKey(){
        return this.key;
    }
    public B getValue() {
        return this.value;
    }
}
