package projava;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WebClient2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // HttpClientオブジェクトを作成する。これを使ってHTTPリクエストを送信する。
        HttpClient client = HttpClient.newHttpClient();

        // アクセスするURI（WebサイトのURL）を指定する。この例では https://example.com/ にアクセス。
        URI uri = URI.create("https://example.com/");

        // HTTPリクエストを作成する。このリクエストはGETメソッドを使用してURIにアクセスする。
        HttpRequest req = HttpRequest.newBuilder(uri).build();

        // HTTPリクエストを送信し、レスポンスを取得する。レスポンスの内容は文字列として取得。
        HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());

        // レスポンスのボディ（WebサイトのHTML内容）を文字列として取得する。
        String body = response.body();

        // レスポンスの内容（ボディ）の最初の5行を出力する。
        body.lines()
                .limit(5) // 最初の5行までを取得
                .forEach(System.out::println); // 各行をコンソールに出力
    }
}
