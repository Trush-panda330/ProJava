package projava;

public class ExExpand {
    public static void main(String[] args) {
        var input = "ab0c1ba2bc9cd1";

        var buf = new StringBuilder();
        var pre = '0';
        for (var ch : input.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                if (pre == '0') {//0の時は先頭文字なので何も出力しない
                    continue;
                }
                for (int i = 0; i < ch - '0' + 1; i++) {
                    buf.append(pre);
                }
            } else {
                pre = ch;
                buf.append(ch);
            }
        }
        var result = buf.toString();
        System.out.println(input);
        System.out.println(result);
    }

}

