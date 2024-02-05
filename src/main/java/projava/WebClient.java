package projava;

import java.io.*;
import java.net.Socket;

public class WebClient {

    public static void main(String[] args) throws IOException {
        var domain = "www.google.com";
        try(var soc = new Socket(domain, 443);
            var pw = new PrintWriter(soc.getOutputStream());
            var isr = new InputStreamReader(soc.getInputStream());
            var bur = new BufferedReader(isr))
        {
            pw.println("GET /index.html HTTP/1.1");
            pw.println("Host: " + domain);
            pw.println();
            pw.flush();
            bur.lines()
                    .limit(18)
                    .forEach(System.out::println);
        }
    }
}
