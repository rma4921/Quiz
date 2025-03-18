package DailyQuiz;

public class DailyQuiz0318 {
    /* 1. 람다식에 대한 설명으로 틀린것은? 답: 4 | 함수형 인터페이스를 람다식으로 표현 가능
    * 1) 람다식은 함수형 인터페이스의 익명 구현 객체를 생성한다.
    * 2) 매개 변수가 없을 경우 ( ) → { … } 형태로 작성한다.
    * 3) (x, y) → { return x + y; }는 (x, y) → x + y;로 바꿀 수 있다.
    * 4) @FunctionalInterface가 기술된 인터페이스만 람다식으로 표현이 가능하다.
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
}
