package Practice;

public class practiceJava01 {
    public static void main(String[] args){
        double d = 3.15;
        //int a2 = d;
        int a2 = (int) d;
        int intValue1 = 500;
        double doubleValue1 = intValue1;
        System.out.println(a2);
        System.out.println(doubleValue1);
        System.out.println();

        String str = "1000000.985";
        double str2 = Double.parseDouble(str);
        //int intValue = Integer.parseInt(str);
        Integer integerValue = Integer.valueOf(str);
        //long longValue = Long.parseLong(str);
        float floatValue = Float.parseFloat(str);
        double doubleValue = Double.parseDouble(str);
        Double doubleValue2 = Double.valueOf(str);
        int intValue2 = 10;
        String stringValue1 = String.valueOf(intValue2);
        String stringValue2 = Integer.toString(intValue2);

        System.out.println(str2);
        //System.out.println(intValue);
        System.out.println(integerValue);
        //System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(doubleValue2);
        System.out.println(stringValue1);
        System.out.println(stringValue2);
    }
}
