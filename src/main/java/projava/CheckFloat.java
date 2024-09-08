package projava;

public class CheckFloat {

    // 浮動小数点数の形式を表す状態を列挙型で定義
    enum FloatState {
        START,    // 初期状態
        INT,      // 整数部
        FRAC_START, // 小数点直後
        FRAC,     // 小数部
        ZERO      // ゼロのみの状態
    }

    // 浮動小数点数として有効かどうかをチェックするメソッド
    static boolean check(String data) {
        var state = FloatState.START; // 初期状態に設定
        for (char ch : data.toCharArray()) { // 文字列を1文字ずつ処理
            switch (state) {
                case START -> { // 開始状態
                    if (ch == '0') { // 文字が '0' の場合
                        state = FloatState.ZERO; // ゼロのみの状態に遷移
                    } else if (ch >= '1' && ch <= '9') { // 文字が 1 から 9 の場合
                        state = FloatState.INT; // 整数部の状態に遷移
                    } else {
                        return false; // 無効な文字が含まれている場合
                    }
                }

                case ZERO -> { // ゼロのみの状態
                    if (ch == '.') { // 小数点の場合
                        state = FloatState.FRAC_START; // 小数点直後の状態に遷移
                    } else {
                        return false; // 小数点以外の文字が続く場合
                    }
                }
                case INT -> { // 整数部の状態
                    if (ch >= '0' && ch <= '9') { // 数字の場合
                        state = FloatState.INT; // 整数部の状態を維持
                    } else if (ch == '.') { // 小数点の場合
                        state = FloatState.FRAC_START; // 小数点直後の状態に遷移
                    } else {
                        return false; // 無効な文字が含まれている場合
                    }
                }
                case FRAC_START, FRAC -> { // 小数点直後の状態
                    if (ch >= '0' && ch <= '9') { // 数字の場合
                        state = FloatState.FRAC; // 小数部の状態に遷移
                    } else {
                        return false; // 数字以外の文字が続く場合
                    }
                }
            }
        }
        // 終了時に状態が有効であれば true を返す
        return switch (state) {
            case ZERO, INT, FRAC -> true; // 状態が ZERO、INT、FRAC の場合は有効
            default -> false; // それ以外の状態は無効
        };
    }

    public static void main(String[] args) {
        // 各テストケースとその結果を表示
        System.out.println("''     : " + check(""));     // 空文字列は無効 => false
        System.out.println("'012'  : " + check("012"));  // 不正な形式 => false
        System.out.println("'.12'  : " + check(".12"));  // 小数点から始まる形式は無効 => false
        System.out.println("'12.'  : " + check("12."));  // 小数点の後に数字がない形式は無効 => false
        System.out.println("'1.2.3': " + check("1.2.3"));// 複数の小数点が含まれる形式は無効 => false
        System.out.println("'1..3' : " + check("1..3")); // 複数の小数点が含まれる形式は無効 => false
        System.out.println("'0'    : " + check("0"));    // 有効な形式 => true
        System.out.println("'12.3' : " + check("12.3")); // 有効な形式 => true
        System.out.println("'0.3'  : " + check("0.3"));  // 有効な形式 => true
        System.out.println("'12.30': " + check("12.30"));// 有効な形式 => true
    }
}
