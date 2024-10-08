package projava;

import java.util.List;

public class InheritSample {
    static abstract class User {
        String name;
        User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        abstract String profile();
        @Override
        public String toString() {
            return profile();
        }
    }

    static class Student extends User {
        @Override
        public String toString() {
            return "%sの%s".formatted(getClass().getSimpleName(),getName());
        }

        @Override
        String profile() {
            return "学生 %s, %d点".formatted(getName(), getScore());
        }

        int score;

        Student(String name, int score) {
            super(name);//省力されている
            this.score = score;
        }
        public int getScore() {
            return score;
        }
    }

    static class Teacher extends User {
        String subject;

        Teacher(String name, String subject) {
            super(name);
            this.subject = subject;
        }

        public String getSubject() {
            return subject;
        }
        @Override
        String profile() {
            return "先生%s, 教科 %s".formatted(getName(), getSubject());
        }
    }

    public static void main(String[] args) {
        List<User> people = List.of(
                new Student("kis", 80),
                new Teacher("hosoya", "Math"));
        for (var p : people) {
            System.out.println("こんにちは%sさん".formatted(p.getName()));
            System.out.println(p);
        }
    }
}