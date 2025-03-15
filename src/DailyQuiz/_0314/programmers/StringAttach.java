package DailyQuiz._0314.programmers;

import java.util.Scanner;

public class StringAttach {
    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            String b = sc.next();

            System.out.println(a+b);
            // System.out.println(a.concat(b));도 가능
            sc.close();
        }
    }
}
