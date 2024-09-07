package projava;

import java.io.IOException; // ファイル操作で例外が発生する可能性があるため、IOExceptionをインポート
import java.nio.file.Files; // ファイルの読み書き操作に使用するクラス
import java.nio.file.Path;  // ファイルパスを扱うクラス

public class WriteFile {
    public static void main(String[] args) {
        // 変数 'message' に、複数行の文字列（テキスト）を代入している。
        var message = """
                かおちゃん
                """;

        // ファイル操作を行うときに、例外が発生する可能性があるのでtry-catchブロックを使用
        try {
            // ファイルパス 'p' に "text.txt" というファイルを指定している
            var p = Path.of("text.txt");

            // 指定したファイルに、message の内容を書き込む
            Files.writeString(p, message);

            // ファイル操作で問題が発生した場合は、IOExceptionをキャッチし、スタックトレースを表示する
        } catch (IOException e) {
            e.printStackTrace(); // エラーが発生した際の詳細情報を表示
        }
    }
}
