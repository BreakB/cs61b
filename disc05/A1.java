public class A1 {
    public static void main(String[] args) {
        A1 y = new B1();
        B1 z = new B1();
        System.out.println(y.fish(z));
        System.out.println(z.fish(z));
        System.out.println(z.fish(y));
        System.out.println(y.fish(y));
        System.out.println(z.fish(z));
        System.out.println(y.fish(y));
    }

    int fish(A1 other) {
        return 1;
    }

    int fish(B1 other) {
        return 2;
    }
}