package projava;

import java.io.IOException; // ファイル操作で発生する可能性のある例外を扱うためにインポート
import java.nio.file.Files; // ファイル操作を行うクラス
import java.nio.file.NoSuchFileException; // ファイルが存在しない場合に投げられる例外
import java.nio.file.Path; // ファイルパスを扱うクラス

public class ReadFile {
    public static void main(String[] args) throws IOException {
        try {
            // "text.txt" というファイルのパスオブジェクトを作成
            var p = Path.of("text.txt");

            // 指定されたファイルの内容を読み込み、文字列として取得
            String s = Files.readString(p);

            // 読み込んだファイルの内容をコンソールに出力
            System.out.println(s);
        } catch (NoSuchFileException e) {
            // ファイルが見つからなかった場合に例外をキャッチし、エラーメッセージを出力
            System.out.println("ファイルが見つかりません：" + e.getFile());
        }
    }
}
