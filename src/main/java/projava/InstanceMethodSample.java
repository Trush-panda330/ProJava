package projava;

import java.sql.Struct;

public class InstanceMethodSample {
    record Student(String name, int englishScore, int mathScore) {
        int average() {
            return (this.englishScore() + this.mathScore()) / 2;
        }


        void showResult() {
            System.out.printf("%sさんの平均点は%dです%n", name(),average());
        }

        public int maxScore() {
            return Math.max(englishScore(),mathScore());
        }
    }

    public static void main(String[] args) {
        var kis = new Student("kis", 60, 80);
        var a = kis.average();
        System.out.printf("平均点は%dです%n", a);

        int max = kis.maxScore();
        System.out.println("最高点は%dです".formatted(max));
    }
}
