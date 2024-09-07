package org.example;

public class Main {
        void test() {
            Inner.message = "Hello, Java";
        }
        static class Inner {
            private static String message;
            public void test() {
                System.out.println(message);
            }
        }
        public static void main(String[] args) {
            new Main().test();
            new Inner().test();
        }
}