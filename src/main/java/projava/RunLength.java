package projava;

public class RunLength {
    public static void main(String[] args) {
        var data = "abbcccbaaaabccccccccccccccccccddd";  // 圧縮対象のデータ文字列
        var count = 0;  // 連続回数をカウント
        char prev = 0;  // 前の文字を記録
        var builder = new StringBuilder();  // 圧縮結果を構築

        // 最初の文字を処理するためのループ前の初期化
        for (var ch : data.toCharArray()) {
            if (count == 0) {  // 最初の文字の場合
                prev = ch;  // prev に初期化
                count = 1;  // count を1にする
                continue;  // 次のループへ
            }

            if (prev == ch) {  // 前の文字と同じ場合
                count++;
                if (count == 9) {  // 連続回数が9に達した場合
                    builder.append(prev).append(9);  // 文字と '9' を追加
                    count = 0;  // カウンタをリセット
                }
            } else {  // 前の文字と異なる場合
                if (count > 1) {  // 連続回数が2以上の場合のみ数字を追加
                    builder.append(prev).append(count);
                } else {
                    builder.append(prev);  // 1回だけ出現の場合はそのまま文字を追加
                }
                prev = ch;  // 新しい文字を prev に設定
                count = 1;  // 新しい文字のためカウントを1にリセット
            }
        }

        // 最後の文字が連続していた場合の処理
        if (count > 1) {
            builder.append(prev).append(count);  // 連続回数を追加
        } else {
            builder.append(prev);  // 最後の文字を追加
        }

        var result = builder.toString();  // 圧縮結果を文字列に変換
        System.out.println(data);  // 元のデータを出力
        System.out.println(result);  // 圧縮後のデータを出力
    }
}
