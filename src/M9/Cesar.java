package M9;

import java.util.Scanner;

public class Cesar {
    public static void main(String[] args){
        String message =  "Flower, Tultip, Aster, Bouquet, Chamomile, Rose, Rosebush";
        System.out.println("Enter the pitch");
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
        System.out.println (encryption);
        System.out.println (decryption);
    }
}