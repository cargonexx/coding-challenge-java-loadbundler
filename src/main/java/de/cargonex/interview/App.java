package de.cargonex.interview;

public class App {
    public String hello() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().hello());
    }
}
