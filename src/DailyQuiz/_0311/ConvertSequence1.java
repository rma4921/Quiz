package DailyQuiz._0311;

//https://school.programmers.co.kr/learn/courses/30/lessons/181882
//조건에 맞는 수열 변환하기1

public class ConvertSequence1 {
    class Solution {
        public int[] solution(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] *= 2;
                }
            }
            return arr;
        }
    }
}
