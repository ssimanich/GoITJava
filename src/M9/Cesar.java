package M9;

import java.util.Scanner;

public class Cesar{
    public static void main(String[] args){
        String message = "Flower, Tultip, Aster, Bouquet, Chamomile, Rose, Rosebush";
        System.out.printf ("Текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java:\n"+message+"\n");
        System.out.print("Введите ключ, для шифрования методом Цезаря:\t");
        Scanner scanner = new Scanner (System.in);
        final int pitch= (Integer.parseInt (scanner.next()));
        final int numberCharactersEngAlphabet=26;
        StringBuilder encryption = new StringBuilder();
        for (char i : message.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encryption.append((char) ('A' + (i - 'A' + (pitch%numberCharactersEngAlphabet
                            +numberCharactersEngAlphabet)) % numberCharactersEngAlphabet ));
                } else {
                    encryption.append((char) ('a' + (i - 'a' + (pitch%numberCharactersEngAlphabet
                            +numberCharactersEngAlphabet)) % numberCharactersEngAlphabet ));
                }
            } else {
                encryption.append(i);
            }
        }
        String message1 = encryption.toString ();
        StringBuilder decryption = new StringBuilder();
        for (char i : message1.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    decryption.append((char) ('A' + (i - ('A' + (pitch%numberCharactersEngAlphabet
                            +numberCharactersEngAlphabet))%numberCharactersEngAlphabet) % numberCharactersEngAlphabet ));
                } else {
                    decryption.append((char) ('a' + (i - ('a' + (pitch%numberCharactersEngAlphabet
                            +numberCharactersEngAlphabet))%numberCharactersEngAlphabet) % numberCharactersEngAlphabet ));
                }
            } else {
                decryption.append(i);
            }
        }
        System.out.print("\n"+"Зашифрованное текстовое представление коллекци обьектов из " +
                " из Модуля 3: ООП в Java:\n"+encryption.toString ()+"\n");
        System.out.print("\n"+"Расшифрованое текстовое представление коллекци обьектов из " +
                " из Модуля 3: ООП в Java:\n"+decryption.toString ()+"\n");
        System.out.print("\n"+"Конец выполнения программы!");

    }
}