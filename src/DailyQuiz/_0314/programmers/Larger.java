package DailyQuiz._0314.programmers;

public class Larger {
    class Solution {
        public int solution(int a, int b) {
            String ab = Integer.toString(a) + Integer.toString(b);
            String ba = Integer.toString(b) + Integer.toString(a);

            /*
            * int answer =  (Integer.parseInt(ab) >= Integer.parseInt(ba)) ? Integer.parseInt(ab) : Integer.parseInt(ba);
            * return answer;
            *
            * ab, ba를 int로 변환해서 해도 됨.
            * +를 사용해서 ab ba 연산하고 바로 int로 변환해도 됨.
            * */

            return Math.max(Integer.valueOf(ab), Integer.valueOf(ba));
        }
    }
}
