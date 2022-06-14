package guru.qa;

public class Examples {
    public static void main(String[] args) {
//      String — строковые переменные, не представляют собой примитивы и хранят в себе целые строки.
        String name = "Daniil";
        System.out.println("example of String: " + "Привет, " + name);

//      char — хранит одиночный символ и занимает 2 байта памяти.
        char k = 'K';
        System.out.println("example of char: " + k + "ot-Kotochek");

//      int — целочисленный тип, хранит целое число от -2147483648 до 2147483647 и занимает 4 байта памяти.
        int a = 1000 / 2;
        int b = 100 * 3;
        System.out.println("example of int: " + (a - b + 22));

//      byte — целочисленный тип, хранит целое число от -128 до 127 и занимает 1 байт памяти.
        byte c = -128;
        byte d = 127;
        System.out.println("example of byte: " + (c + d + 6) % 2);

//      short — целочисленный тип, хранит целое число от -32768 до 32767 и занимает 2 байта памяти.
        short e = -29998;
        e--;
        e--;
        System.out.println("example of short: " + (-e) * (-1));

/*      long — целочисленный тип, хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807
      и занимает 8 байт памяти. */
        long f = 1234567890123456L;
        f++;
        System.out.println("example of long: " + f % 1000000);

//      float — хранит число с плавающей точкой (до 7 десятичных цифр)
        float g = 7.12345678F;
        float h = 0;
        h += g;
        System.out.println("example of float: " + h);

//      double — хранит число с плавающей точкой (до 15 десятичных цифр)
        double j = 133.9476762553;
        System.out.println("example of double: " + j / 2 * (-1.5));

//      boolean — логические тип данных, хранит в себе значение true и false.
        boolean ex1 = a == b;
        boolean ex2 = e >= f;
        boolean ex3 = h != j;
        System.out.println("example of boolean: " + ex1);
        System.out.println("example of boolean: " + ex2);
        System.out.println("example of boolean: " + ex3);

//      вычисления комбинаций типов данных (int и double)
        System.out.println("int plus double equals " + ((14 + 1.5) * 3));

//      вычисления комбинаций типов данных (int и long)
        System.out.println("int plus long equals " + ((44444 + 5000000000000000000L) / 2));

//      переполнение в max сторону
        int max1 = 1500000000;
        int max2 = 2000000000;
        int maxResult = max1 + max2;
        System.out.println("overflow max: " + maxResult);

//      переполнение в min сторону
        int min1 = -1500000000;
        int min2 = -2000000000;
        int minResult = min1 + min2;
        System.out.println("overflow min: " + minResult);
    }
}
