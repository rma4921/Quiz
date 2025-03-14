package DailyQuiz._0314.Quiz;

// main을 참고하여 Container 제네릭 타입을 선언해보세요.

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        stringContainer.set("홍길동");
        String str = stringContainer.get();

        Container<Integer> intContainer = new Container<>();
        intContainer.set(6);
        int value = intContainer.get();

        System.out.println("str: " + str);
        System.out.println("value: " + value);
    }
}
