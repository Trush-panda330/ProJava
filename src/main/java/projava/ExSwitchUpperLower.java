package projava;

public class ExSwitchUpperLower {
    public static void main(String[] args) {
        var input = "aa0bcd1efg1gg0abc";

        var buf = new StringBuilder();
        var lower = true;
        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '0' -> lower = false;
                case '1' -> lower = true;
                default -> {
                    if (lower) {
                        buf.append(Character.toLowerCase(ch));
                    } else {
                        buf.append(Character.toUpperCase(ch));
                    }
                }
            }
        }
        var result = buf.toString();
        System.out.println(input);
        System.out.println(result);
    }
}
