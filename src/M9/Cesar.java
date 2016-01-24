package M9;

import java.util.Scanner;

public class Cesar {
    public static void main(String[] args){
        String message =  "Flower, Tultip, Aster, Bouquet, Chamomile, Rose, Rosebush";
        System.out.println ("Текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java:\n"+message+"\n");
        System.out.print("Введите ключ, для шифрования методом Цезаря:");
        Scanner scanner = new Scanner (System.in);
        final int pitch= (Integer.parseInt (scanner.next()));
        StringBuilder encryption = new StringBuilder();
        for (char i : message.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encryption.append((char) ('A' + (i - 'A' + pitch) % 26 ));
                } else {
                    encryption.append((char) ('a' + (i - 'a' + pitch) % 26 ));
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
                    decryption.append((char) ('A' + (i - ('A' + pitch)%26) % 26 ));
                } else {
                    decryption.append((char) ('a' + (i - ('a' + pitch)%26) % 26 ));
                }
            } else {
                decryption.append(i);
            }
        }
        System.out.println ("\n"+"Зашифрованное текстовое представление коллекци обьектов из " +
                " из Модуля 3: ООП в Java:\n"+encryption+"\n");
        System.out.println ("Расшифрованое текстовое представление коллекци обьектов из " +
                " из Модуля 3: ООП в Java:\n"+decryption+"\n");
        System.out.println("Конец выполнения программы");
    }
}