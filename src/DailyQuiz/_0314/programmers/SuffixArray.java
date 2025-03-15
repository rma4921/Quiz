package DailyQuiz._0314.programmers;

import java.util.Arrays;

public class SuffixArray {
    class Solution {
        public String[] solution(String my_string) {
            String[] suffixes = new String[my_string.length()];

            for (int i = 0; i < my_string.length(); i++) {
                suffixes[i] = my_string.substring(i);
            }
            Arrays.sort(suffixes); // sort 대신 정렬 알고리즘을 작성해도 됨.
            return suffixes;
        }
    }
}
/*
for (int i = 1; i < suffixes.length; i++) {
    String temp = suffixes[i];
    int j = i - 1;

    while (j >= 0 && suffixes[j].compareTo(temp) > 0) {
        suffixes[j + 1] = suffixes[j];
        j--;
    }
    suffixes[j + 1] = key;
}
* */