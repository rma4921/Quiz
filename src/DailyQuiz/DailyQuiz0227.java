package DailyQuiz;
//02-27 quiz
public class DailyQuiz0227 {
    public static void main(String[] args){
        // 1. 아래 2개의 변수 number1, number2의 사칙 연산 결과(result1 ~ result4)를 정수로 출력하세요.
        // (사칙연산: +, -, *, /) 주석처리 된 곳에 코드를 채우면 됩니다.
        int number1 = 10;
        double number2 = 2.0;
        int result1, result2, result3, result4;
        // 사칙연산 코드 추가
        result1 = number1 + (int)number2;
        result2 = number1 - (int)number2;
        result3 = number1 * (int)number2;
        result4 = number1 / (int)number2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        /*2. 아래 코드의 출력값은 무엇일까요? 코드를 돌려보기 전에 예측해보세요.
        1) 17
        2) 11 10 11 10
        3) false true true
        */
        //3. 다음의 내용을 연산식(조건식)으로 표현해보세요.
        //i는 2의 배수 또는 3의 배수이다. (i % 2 == 0) || (i % 3 == 0)
        //4. 아래 코드의 실행 결과가 true가 되도록 수정해보세요.
        String str1 = new String("Hello world!");
        String str2 = new String("Hello world!");

        System.out.println(str1.equals(str2));
        /*5. 프로그래머스 문제
            1) 공배수
            int solution(int number, int n, int m) {
                if((number % n == 0) && (number % m == 0))
                    return 1;
                return 0;
            }
            2) n의 배수
            int solution(int num, int n) {
                if (num % n == 0)
                    return 1;
                return 0;
            }
            3) flag에 따라 값 변화하기
            int solution(int a, int b, bool flag) {
                if (flag)
                    return (a + b);
                return (a-b);
            }
         */
    }
}
