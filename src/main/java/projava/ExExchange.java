package projava;

public class ExExchange {
    public static void main(String[] args) {
        var data = "abcde"; //文字列の宣言

        var builder = new StringBuilder(); //ストリングビルダーメソッドを生成
        for (int i = 0; i < data.length(); i += 2) {
            if (i + 1 < data.length()) {
                builder.append(data.charAt(i + 1));
            }
            builder.append(data.charAt(i));
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
