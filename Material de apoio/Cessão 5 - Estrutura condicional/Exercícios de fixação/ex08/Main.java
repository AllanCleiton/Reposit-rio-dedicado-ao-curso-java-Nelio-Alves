package ex08;

public class Main {
    public static void main(String[] args) {
        int a, b;

        a = 73; // 01001001
        b = a ^ (1 << 3); //00001000
        System.out.printf("a: %d\tb: %d\n",a,b);

        b = b ^ (1 << 3); // 00001000

        System.out.printf("a: %d\tb: %d\n", a, b);
    }
}
