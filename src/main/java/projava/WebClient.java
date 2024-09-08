package projava;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import java.io.*; // 必要なクラスをインポート
import java.net.Socket; // Socketクラスをインポート

public class WebClient {

    public static void main(String[] args) throws IOException {
        var domain = "example.com"; // 接続先のドメインを指定
        SocketFactory factory = SSLSocketFactory.getDefault();
        // try-with-resourcesを使用して、Socket、PrintWriter、InputStreamReader、BufferedReaderを自動的にクローズする
        try (Socket soc = factory.createSocket(domain, 80); // ソケットを作成し、指定したドメインのポート443（HTTPS）に接続
             var pw = new PrintWriter(soc.getOutputStream()); // ソケットの出力ストリームを使ってPrintWriterを作成
            // ソケットの入力ストリームを使ってInputStreamReaderを作成
             var bur = new BufferedReader(new InputStreamReader(soc.getInputStream()))) { // InputStreamReaderを使ってBufferedReaderを作成

            // HTTPリクエストを送信
            pw.println("GET /index.html HTTP/1.1"); // リクエストライン（GETメソッド、リソースパス、HTTPバージョン）
            pw.println("Host: " + domain); // ホストヘッダー（サーバーのドメイン名）
            pw.println(); // 空の行を追加してリクエストの終了を示す
            pw.flush(); // バッファにあるデータを強制的に送信

            // レスポンスの最初の18行を読み取り、表示する
            bur.lines()
                    .limit(18) // 最初の18行のみを読み取る
                    .forEach(System.out::println); // 各行をコンソールに表示
        }
    }
}
