package by.control.root.service;

public class App {
    public static String getHelloServ() {
        return by.control.root.repository.App.getHelloRep() + " Hello from service! ";
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
