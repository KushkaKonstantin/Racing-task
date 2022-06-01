package ua.com.javarush.kkushka.modul1.BruteForce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import static ua.com.javarush.kkushka.modul1.BruteForce.BruteForce.bruteForce;

public class BruteForceFile {


    public static void bruteForseFile() {
        Path pathToFileForCoder = Path.of("src/ua/com/javarush/kkushka/modul1/CoderDecoder/FileforCoder.txt").toAbsolutePath();
        Path pathToFileWithBrute = Path.of("src/ua/com/javarush/kkushka/modul1/BruteForce/FileWithBrute.txt").toAbsolutePath();

        try (FileReader fileReader = new FileReader(pathToFileForCoder.toFile());
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(pathToFileWithBrute.toFile())) {

            while (bufferedReader.ready()) {
                String text = bufferedReader.readLine();
                fileWriter.write(bruteForce(text));
                fileWriter.flush();
            }

            System.out.println("Ваш файл расшифрован методом Брут Форс. Он находится в файле  - FileWithBrute.txt");
        } catch (IOException e) {
            System.err.println("Файл не найденм!");
            System.err.println("Укажите действующий путь к файлу! Вы указали путь - " + e.getMessage());
        }


    }
}
