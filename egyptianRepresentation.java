public class egyptianRepresentation {
    static void egyptian(int a, int b) {
        if (a == 0 || b == 0) {
            return;
        }
        if (b % a == 0) {
            System.out.printf("1 / %d", b / a);
        }
        int s = (b / a) +1;
        System.out.printf("1 / %d", s);
        egyptian((a * s) - b, (b * s));
    }

    public static void main(String[] args) {
        int a = 3, b = 15;
        egyptian(a, b);
    }
}
