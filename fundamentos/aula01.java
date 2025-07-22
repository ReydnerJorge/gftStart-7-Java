package fundamentos;

import java.util.Scanner;

public class aula01 {
    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome";
    public static void main(String[] args) {
        // estrutura básica de um programa em Java
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();

        System.out.println("Informe a sua idade: ");
        int age = scanner.nextInt();

        // System.out.println("Olá " + name + " sua idade é " + age);
        System.out.printf("Olá %s sua idade é %s anos\n", name, age);
    }
}
/**
 * 
 */