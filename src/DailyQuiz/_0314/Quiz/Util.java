package DailyQuiz._0314.Quiz;

public class Util {
    // Pair의 필드에 K key와 V value
    // 값으로는 V value를 출력...
    // 키 값이 일치하면  Pair에 V value를 출력
    // public static V getValue(P pair, K key) -> 제약 조건...
    public static <K, V, P extends Pair<K, V>> V getValue(P pair, K key) {
        if (pair.getKey().equals(key)) {
            return pair.getValue();
        }
        return null;
    }
}