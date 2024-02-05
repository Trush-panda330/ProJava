package projava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {
    public static void main(String[] args) {
        var message = """
                かおちゃん
                """;
        try {
            var p = Path.of("text.txt");
            Files.writeString(p,message);
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
