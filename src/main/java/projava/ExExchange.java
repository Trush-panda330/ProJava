package projava;

public class ExExchange {
    public static void main(String[] args) {
        var data = "abcde"; // 入力データとしての文字列を宣言
        // StringBuilder を生成（文字列の構築用）
        var builder = new StringBuilder();

        // 奇数番目の文字だけ処理すればよいので更新分はi += 2
        for (int i = 0; i < data.length(); i += 2) {
            // 次の文字が文字列の長さより短い時(=最後の文字でない場合）次の文字を追加
            if (i + 1 < data.length()) {
                builder.append(data.charAt(i + 1)); // 次の文字を追加
            }
            // 現在のインデックスの文字を追加
            builder.append(data.charAt(i));
        }

        // StringBuilder から最終的な文字列を取得
        var result = builder.toString();
        System.out.println(data); // 元の文字列
        System.out.println(result); // 変換後
    }
}
