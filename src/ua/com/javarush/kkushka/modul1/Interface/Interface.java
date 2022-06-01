package ua.com.javarush.kkushka.modul1.Interface;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;
import static ua.com.javarush.kkushka.modul1.BruteForce.BruteForceFile.bruteForseFile;
import static ua.com.javarush.kkushka.modul1.Coder.CoderFile.coderFile;
import static ua.com.javarush.kkushka.modul1.Decoder.DeCoderFile.deCoderFile;


public class Interface {
    static Scanner scanner = new Scanner(System.in);
    public static final int coder = 1;
    public static final int decoder = 2;
    public static final int bruteForce = 3;
    public static final int exit = 4;

    public static void options(int option) {

        switch (option) {
            case 1:
                System.out.println("---Зашифровка файла---");
                break;
            case 2:
                System.out.println("--Расшифровка файла---");
                break;
            case 3:
                System.out.println("--Brute Force---");
                break;
            case 4:
                System.out.println("До свидания");
                exit(0);
        }
    }

    public static void interfaces() {
        System.out.println("Программа шифрования шифра Цезаря на русском языке");
        System.out.println("-------------");
        System.out.println("Введите  цифру : \n1 - Зашифровка текста\n" +
                "2 - Расшифровка текста\n" +
                "3 - (Brute Force)\n" +
                "4 - Выход");
        System.out.println("-------------");
    }


    public static void start() throws IOException {

        interfaces();
        int choice = scanner.nextInt();
        options(choice);
        if (choice == coder) {
            System.out.println("Укажите ключ по зашифроке");
            int key = scanner.nextInt();
            coderFile(key);
        } else if (choice == decoder) {
            System.out.println("Укажите  ключ по расшифровке");
            int key = scanner.nextInt();
            deCoderFile(key);
        } else if (choice == bruteForce) {
            bruteForseFile();
        } else if (choice == exit) {

            exit(0);

        }

    }


}