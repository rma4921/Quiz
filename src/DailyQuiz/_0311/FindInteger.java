package DailyQuiz._0311;

public class FindInteger {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181840
    // 정수 찾기
    class Solution {
        public int solution(int[] num_list, int n) {
            for (int num : num_list) {
                if (num == n) {
                    return 1;
                }
            }
            return 0;
        }
    }
}
