package ua.com.javarush.kkushka.modul1.Coder;

import static ua.com.javarush.kkushka.modul1.alphabet.Alphabet.alphabet;


public class Coder {

    public static String coder(String text, int key) {

        StringBuilder stringBuilder = new StringBuilder();
        int index;
        for (int i = 0; i < text.length(); i++) {
            index = (alphabet.indexOf(text.charAt(i)) + key) % alphabet.length();
            if (index < 0) {
                index = alphabet.length() + index ;
            }
            stringBuilder.append(alphabet.charAt(index));
        }
        return stringBuilder + "\n";
    }


}