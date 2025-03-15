package DailyQuiz._0314.programmers;

public class Comparison {
    class Solution {
        public int solution(int a, int b) {
            int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
            // + "" + 사용해서 해도 됨.
            int twoAB = 2 * a * b;
            return Math.max(ab, twoAB);
        }
    }
}
