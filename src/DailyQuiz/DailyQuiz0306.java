package DailyQuiz;

public class DailyQuiz0306 {
    public static void main(String[] args){
        // 문제 1번: for문을 이용해서 a배열의 값을 b배열로 복사해보세요
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j]; // a 배열의 값을 b 배열로 복사
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);
                System.out.println("b[" + i + "][" + j + "]: " + b[i][j]);
            }
        }
        // 문제 2번: for문을 이용하여 배열에 있는 숫자들의 최대값과 평균을 구하세요.
        int[] array = {12, 4, 7, 20, 1};
        int max = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            sum += array[i];
        }
        double avg = (double) sum / array.length;

        System.out.println(max);
        System.out.println(avg);
        // 문제 3번: 0부터 20까지 짝수만 출력하는 코드를 작성해보세요.
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 문제 4번: 프로그래머스 문제
        // 4-1: 짝수의 합
        /*
        class Solution {
            public int solution(int n) {
                int answer = 0;
                for (int i = 0; i <= n; i+=2){
                    answer += i;
                }
                return answer;
            }
        } */
        // 4-2: 배열의 평균
        /*
        class Solution {
            public double solution(int[] numbers) {
                double answer = 0;
                int sum = 0;
                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i];
                }
                return (answer = (double) sum / numbers.length);
            }
        }
         */
        // 4-3: 양꼬치
        /*
        class Solution {
            public int solution(int n, int k) {
                int lambCost = n * 12000;
                int freeDrink = n / 10;
                int drinkCost = (k - freeDrink) * 2000;

                return lambCost + drinkCost;
            }
        }
        */
    }
}
