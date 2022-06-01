package ua.com.javarush.kkushka.modul1.Decoder;

import java.io.*;
import java.nio.file.Path;

import static ua.com.javarush.kkushka.modul1.Coder.Coder.coder;


public class DeCoderFile {

    public static void deCoderFile(int key) {
        Path pathToFileForCoder = Path.of("src/ua/com/javarush/kkushka/modul1/CoderDecoder/FileforCoder.txt").toAbsolutePath();
        Path pathToFileForDeCedor = Path.of("src/ua/com/javarush/kkushka/modul1/CoderDecoder/Decoderfile.txt").toAbsolutePath();

        try (FileReader fileReader = new FileReader(pathToFileForCoder.toFile());
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(pathToFileForDeCedor.toFile())) {

            while (bufferedReader.ready()) {
                String text = bufferedReader.readLine();
                fileWriter.write(coder(text, -key));
                fileWriter.flush();
            }
            System.out.println("Ваш файл расшифрован. Он находится в файле  - Decoderfile.txt");
        } catch (IOException e) {
        }
    }
}
