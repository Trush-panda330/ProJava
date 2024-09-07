package projava;

public class RunLength {
    public static void main(String[] args) {
        final var COUNTER_BASE = -1;
        var data = "abbcccbaaaabccccccccccccddd";
        var count = COUNTER_BASE;
        char prev = 0;
        var builder  = new StringBuilder();
        for (var ch : data.toCharArray()) {
            if (prev == ch) {  /*同じ文字が続くとき*/
                count++;
                if (count == 9) {
                    builder.append('9');
                    builder.append(ch);
                    count = COUNTER_BASE;
                }
            } else {
                //違う文字が来たとき
                if (count >= 0) {
                    //前の文字が連続していたので数字を出力
                    builder.append((char)('0' + count));
                }
                builder.append(ch);
                count = 0;  // reset count for the new character
            }
            prev = ch;
        }
        //最後の文字が連続していれば数字を出力
        if (count >= 0) {
            builder.append((char)('0' + count));
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
