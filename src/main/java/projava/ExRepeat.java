package projava;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExRepeat {
    public static void main(String[] args) {
        var result = IntStream.range(0 , 3)
                .mapToObj(n -> "test")
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
