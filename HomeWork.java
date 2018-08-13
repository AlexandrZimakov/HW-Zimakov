/**
 * Java 1. lesson 1
 *
 * @author Alexandr Zimakov
 * @version dated Aug 12, 2018
 */


public class HomeWork {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 4;
        long d = 8;
        float e = 4;
        double f =8.0;
        char g = 'a';
        boolean h = true;
        String str = "Hello";

        double first = calc(1.0, 2.0, 3.0, 4.0);
        System.out.println(first);
        boolean second = isSumInRange(11, 12);
        System.out.println(second);
        printNum(-10);
        boolean  v = isNegativ(20);
        System.out.println(v);
        printName("Alexandr");
        isLeapyear(2012);
    }

    static double calc(double a, double b, double c, double d) {
        double first = c / d;
        double second = b + first;

        return a * second;
    }

    static boolean isSumInRange (int a,int b) {
        boolean result = false;

        int sum = a + b;
        if (sum > 10 && sum <= 20 ) {
            result = true;
        }

        return result;
    }

    static void printNum (int a ) {
        if (a < 0) {
            System.out.println ("The number is negativ");
        }
        else {
            System.out.println ("The number is positiv");
        }
    }

    static boolean isNegativ (int a) {
        boolean result = false;
        if (a < 0) {
            result = true;
        }

        return result;
    }

    static void printName (String name) {
        System.out.println("Привет," + name + "!");
    }

    static void isLeapyear (int year) {
        if ( (year % 400) == 0 ){
            System.out.println ("The year is Leap-year");
        }
        else if ( (year % 100) == 0 ) {
            System.out.println ("The year is not Leap-year");
        }
        else if ( (year % 4) == 0) {
            System.out.println ("The year is Leap-year");
        }
        else {
            System.out.println ("The year is not Leap-year");
        }
    }


}

