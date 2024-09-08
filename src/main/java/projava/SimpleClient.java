package projava;

import java.io.*;
import java.net.Socket; // ソケットクラスのインポート

public class SimpleClient {
    public static void main(String[] args) {
        // サーバーのIPアドレスとポートを指定
        try (Socket socket = new Socket("localhost", 1600);
             // サーバーにデータを送信するための出力ストリームを取得
             OutputStream output = socket.getOutputStream();
             // サーバーからのデータを受信するための入力ストリームを取得
             InputStream input = socket.getInputStream();
             // サーバーからの応答を読み取るためのBufferedReaderを作成
             BufferedReader reader = new BufferedReader(new InputStreamReader(input)))
        {
            // サーバーにデータを送信
            output.write(65); // ASCIIコードの65（文字 'A'）をサーバーに送信
            output.flush(); // バッファに溜まっているデータを強制的に送信

            // サーバーからの応答を受け取る
            String response = reader.readLine(); // サーバーからの一行の応答を読み取る
            System.out.println("Received from server: " + response); // サーバーからの応答を表示

        } catch (IOException e) {
            e.printStackTrace(); // 例外発生時にスタックトレースを表示
        }
    }
}
