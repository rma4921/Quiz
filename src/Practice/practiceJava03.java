package Practice;
import java.util.Scanner;
//03-06 practice
public class practiceJava03 {
    public static void main(String[] args){
        // quiz1 팩토리얼
        int n = Integer.parseInt(args[0]);

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
        /* 직접 입력받기
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = scan.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
        scan.close();*/
        // quiz2 구구단
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int i = scan.nextInt();
        for (int x = 1; x < 10; x++) {
            System.out.print((x * i) + " ");
        }
        System.out.println();
        // quiz3 정수를 입력받아 삼격형 별을 출력
        Scanner scan2 = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int a = scan2.nextInt();
        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // quiz4 사용자로부터 정수를 입력받고 숫자를 뒤집에서 출력
        Scanner scan3 = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = scan3.nextInt();
        int reverseNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        System.out.println(reverseNum);

        scan.close();
        scan2.close();
        scan3.close();
    }
}
