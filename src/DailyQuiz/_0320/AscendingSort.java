package DailyQuiz._0320;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * 스트림과 컬렉션을 사용하여 코드를 작성해주세요.
 * 문제는 스트림으로 해결한 버전과 스트림으로 해결하지 않은 버전 모두 작성해주세요.
 *
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성해보세요.
 * */
public class AscendingSort {
    public int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        // 코드 작성
        /* 스트림으로 풀지 않는 경우.
        1.
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            result[array1.length + i] = array2[i];
        }
        Arrays.sort(result);

        2. 리스트로 푸는 방법
        List<Integer> result1 = new ArrayList<>();
        for (int num : array1) {
            result.add(num);
        }
        for (int num : array2) {
            result.add(num);
        }
        */
        result = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .toArray();
        return result;
    }

    public static void main(String[] args) {
        AscendingSort ascendingSort = new AscendingSort();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}