package ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readMethod();
        System.out.println("I hope this is printed!");
    }

    public static void method1() {
        System.out.println("Method 1");
        method2();
        System.out.println("Important stuff");
    }

    public static void method2() {
        System.out.println("Method 2");
        try {
            method3(10);
        } catch (FileNotFoundException e) {
            try {
                method3(-30);
            } catch (FileNotFoundException | ClassNotFoundException ignored) {
                System.out.println("I don't care!");
            }
        } catch (ClassNotFoundException e2) {
            System.out.println("Ups!");
        } finally {
            System.out.println("I do it anyway!");
        }
        System.out.println("Important stuff");
    }

    public static void readMethod() {
        try (Scanner s = new Scanner(new File("da"))) {
            // poate arunca aici o exceptie
            String next = s.next();
            // metoda care poate arunca o exceptie
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void method3(int i) throws FileNotFoundException, ClassNotFoundException {
        System.out.println("Method 3");
        if (true) throw new NullPointerException();
        if (i > 0) {
            throw new FileNotFoundException("this is a checked exception");
        } else if (i < -10) {
            throw new ClassNotFoundException();
        } else {
            System.out.println("WIN lottery");
        }
    }
}