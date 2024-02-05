package projava;

import java.util.List;

public class ForEachListSample {
    public static void main(String[] args) {
        var names = new String[] {"yusuke","kis","sugiyama"};
        for (var name: names){
            System.out.println(name);
        }
    }
}
