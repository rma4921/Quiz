package DailyQuiz._0311;

public class lastTwoElements {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181927
    // 마지막 두 원소 문제
    class Solution {
        public int[] solution(int[] num_list) {
            int last = num_list[num_list.length - 1];
            int secondLast = num_list[num_list.length -2];
            int[] answer = new int[num_list.length + 1];

            for (int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[i];
            }
            answer[num_list.length] = (last > secondLast) ? (last - secondLast) : (last * 2);
            return answer;
        }
    }
}
