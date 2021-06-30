public class Main {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        System.out.println(result = i2 / d1 + d2 % i1 - l);
        int a = 5;
        int resultA = a-- - --a + ++a + a++ + a;
        int b = 8;
        int resultB = ++b - b++ + ++b - --b;

        System.out.println(resultA);
        System.out.println(resultB);
        //System.out.println();
    }
}