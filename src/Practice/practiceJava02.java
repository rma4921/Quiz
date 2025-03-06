package Practice;

public class practiceJava02 {
    public static void main(String[] args){
        String str = args[0];
        switch (str) {
            case "월요일":
                System.out.println("Start of the work week.");
                break;
            case "금요일":
                System.out.println("Almost weekend");
                break;
            case "화요일", "수요일", "목요일":
                System.out.println("Midweek");
                break;
            case "토요일", "일요일":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("invalid value");
                break;
        }
    }
}
