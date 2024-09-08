package projava;

public class RemoveDuplicate {
    public static void main(String[] args) {
        var data = "abcccbaabcc";

        var builder = new StringBuilder();
        //builderに重複を除いた新しい文字列を作る処理を行う
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            //iが0の時は前に文字がないため比較しようがないため処理はしない
            //またiの時のcがひとつ前(i - 1)の文字と同じ時も処理をしない
            if(i > 0 && c == data.charAt(i - 1))
                continue;
            builder.append(c);
            }
        /*全ての文字の処理が終わったらtoString()で
        StringBuilderオブジェクトに構築された文字列を取得する*/
        String result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
