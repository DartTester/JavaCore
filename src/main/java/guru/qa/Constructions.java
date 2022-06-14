package guru.qa;

public class Constructions {

    //      логические операторы и конструкция ifElse
    public static void ifElse() {
        int m = 10;
        int n = 20;
        if (m > -10 || n >= 1) {
            System.out.println(m + n);
        } else if (m < -10 || n >= 5) {
            System.out.println(m * n);
        } else {
            System.out.println("Повторите ввод");
        }
    }

    public static void compareOperator() {
        int o = 10;
        int p = 20;
        System.out.println("a == b = " + (o == p));
        System.out.println("a != b = " + (o != p));
        System.out.println("a > b = " + (o > p));
        System.out.println("a < b = " + (o < p));
        System.out.println("b >= a = " + (p >= o));
        System.out.println("b <= a = " + (p <= o));
    }

}
