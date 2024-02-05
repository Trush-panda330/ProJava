package projava;

import java.util.Arrays;
public class ParamSample {
    /**
     * プロフラム開始時に呼び出される
     * @param args　コマンドライン引数
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
    }
}
/*
public ではないアウタークラス
複数のアウタークラスを1つのファイルに定義できることを示すため
 */
class Dummy{

}