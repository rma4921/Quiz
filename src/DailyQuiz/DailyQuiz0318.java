package DailyQuiz;

import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class DailyQuiz0318 {
    /* 1. 람다식에 대한 설명으로 틀린것은? 답: 4 | 함수형 인터페이스를 람다식으로 표현 가능
    * 1) 람다식은 함수형 인터페이스의 익명 구현 객체를 생성한다.
    * 2) 매개 변수가 없을 경우 ( ) → { … } 형태로 작성한다.
    * 3) (x, y) → { return x + y; }는 (x, y) → x + y;로 바꿀 수 있다.
    * 4) @FunctionalInterface가 기술된 인터페이스만 람다식으로 표현이 가능하다.
    * */

    /* 2. 메소드 참조에 대한 설명으로 틀린 것은? 답: 4번 | 매개변수가 있는 생성자도 참조할 수 있다.
    * 1) 메소드 참조는 함수적 인터페이스의 익명 구현 객체를 생성한다.
    * 2) 인스턴스 메소드는 “참조변수::메소드”로 기술한다.
    * 3) 정적 메소드는 “클래스::메소드”로 기술한다.
    * 4) 생성자 참조인 “클래스::new”는 매개 변수가 없는 디폴트 생성자만 호출한다.
    * */

    /* 3. 잘못 작성한 람다식은? 답: 2 | 매개변수가 2개 이상이므로 ()가 필요
    * 1)  a → a + 3
    * 2) a, b → a * b
    * 3) x → System.out.println(x/5)
    * 4) (x, y) → Math.max(x, y)
    * */

    /* 4. 다음 코드는 컴파일 에러가 발생합니다. 그 이유는? // x *= 10; 오류.
public class LambdaExample {
    public static int method(int x, int y) {
        IntSupplier supplier = () -> {
            x *= 10; // 람다식 내부에서 지역 변수의 값을 변경할 수 없다.
            int result = x + y;
            return result;
        };
        int result = supplier.getAsInt();
        return result;
    }
    public static void main(String[] args) {
        System.out.println(method(3, 5));
    }
}
    * */

    // IntBinaryOperator
    /* 5. 다음은 배열 항목 중 최대값 또는 최소값을 찾는 코드입니다. maxOrMin() 메소드의 매개값을 람다식으로 기술해보세요.
public class LambdaExample_5 {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        // 최대값 얻기 구현
        int max = maxOrMin((a, b) -> (a > b) ? a : b);
        System.out.println("최대값 : " + max);
        // 최소값 얻기 구현
        int min = maxOrMin((a, b) -> (a < b) ? a : b);
        System.out.println("최소값: " + min);
}
}
    * */

    // ToIntFunction
    /* 6. 다음은 학생의 영어 평균 점수와 수학 평균 점수를 계산하는 코드입니다. avg() 메소드를 선언해보세요.
public class LambdaExample_6 {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("저팔계", 95, 93)
    };
		//  avg() 메소드 작성
    public static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for (Student student : students) {
            sum += function.applyAsInt(student);
        }
        return sum / students.length;
    }

    public static void main(String[] args) {
        double englishAvg = avg( s -> s.getEnglishScore() );
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg( s -> s.getMathScore() );
        System.out.println("수학 평균 점수: " + mathAvg);
    }

    public static class Student {
        private String name;
        private int englishScore;
        private int mathScore;

        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public String getName() {
            return name;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public int getMathScore() {
            return mathScore;
        }
    }
}
    * */

    /* 7. 6번의 main() 메소드에서 avg() 호출할 때 매개값으로 준 람다식을 메소드 참조로 변경해보세요.
    * double englishAvg = average( s -> s.getEnglishScore() );
    * -> double englishAvg = avg (Student::getEnglishScore);
    * double mathAvg = average( s -> s.getMathScore() );
    * -> double mathAvg = avg (Student::getMathScore);
    * */
}
