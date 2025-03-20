package DailyQuiz._0320;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
* 스트림과 컬렉션을 사용하여 코드를 작성해주세요.
* 문제는 스트림으로 해결한 버전과 스트림으로 해결하지 않은 버전 모두 작성해주세요.
*
* N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
*  (첫 번째 수는 무조건 출력합니다)
*
* 입력설명
* 첫 줄에 자연수 N이 주어지고, 그 다음 줄에 N개의 정수가 입력됩니다.
*
* 출력설명
* 자신의 바로 앞 수보다 큰 수만 한 줄로 출력합니다.
*
* 입력예제 1
* 6
* 7 3 9 5 6 12
*
* 출력예제 1
* 7 9 6 12
* */

public class PrintMoreBigNumber {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();

        // 코드 작성
        answer.add(array[0]);
        /* 스트림을 사용하지 않은 버전
        for (int i = 1; i < n; i++) {
            if (array[i] > array[i - 1]) {
                answer.add(array[i]);
            }
        }
        */
        IntStream.range(1, n)
                .filter(index -> array[index] > array[index - 1])
                .forEach(index -> answer.add(array[index]));

        return answer;
    }

    public static void main(String[] args) {
        PrintMoreBigNumber printMoreBigNumber = new PrintMoreBigNumber();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : printMoreBigNumber.solution(number, array)) {
            System.out.print(x + " ");
        }
    }
}