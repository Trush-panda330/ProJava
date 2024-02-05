package projava;

import java.util.ArrayList;
import java.util.List;
public class StreamSample {
    public static void main(String[] args) {
        var names = List.of("yamamoto", "kis", "sugiyama");

        var fiveOver = new ArrayList<String>();
        for (var s : names) {
            if (s.length() >= 5) {
                fiveOver.add(s);
            }
        }
        System.out.println(fiveOver);
    }
}
