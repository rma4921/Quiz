package DailyQuiz._0314.Quiz;

// main을 참고하여 TwoContainer 제네릭 타입을 선언해보세요.

public class TwoContainerExample {

    public static void main(String[] args) {
        TwoContainer<String, String> container = new TwoContainer<>();
        container.set("홍길동", "도적");
        String name = container.getKey();
        String job = container.getValue();

        TwoContainer<String, Integer> secondContainer = new TwoContainer<>();
        secondContainer.set("홍길동", 35);
        String name2 = secondContainer.getKey();
        Integer age = secondContainer.getValue();

        System.out.println("name: " + name);
        System.out.println("job: " + job);
        System.out.println("name2: " + name2);
        System.out.println("age: " + age);
    }
}