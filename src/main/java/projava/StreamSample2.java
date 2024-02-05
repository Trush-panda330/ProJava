package projava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample2 {
    public static void main(String[] args) {
        var date = List.of("yamamoto", "kis", "sugiyama");

        var result = date.stream()//streamソース
                .filter(s -> s.length() >= 5)//中間処理（値を操作する）
                .collect(Collectors.toCollection(ArrayList::new));//終端処理（値をまとめる）
        System.out.println(result);
    }
}