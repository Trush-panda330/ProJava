public class ForHello {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i >= 3 && i <= 6) {
                continue;
            }
            System.out.println(i);
        }
    }
}
