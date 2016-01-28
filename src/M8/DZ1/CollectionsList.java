package M8.DZ1;

import java.util.*;

public class CollectionsList{
    public static void main(String[] args) {
        List<Object> flowersmass = new ArrayList();
        String[] flowersMass = { "Flower", "Tultip", "Aster", "Bouquet", "Chamomile", "Rose", "Rosebush"};
        String[] directoryMass = { "AudioFile", "Directory", "File", "ImageFile", "TextFile"};
        String[] musikMass = { "A_music_shop", "Guitar", "Musical_instrument", "Piano", "Trubalzuya"};
        System.out.println("Ввод данных в коллекцию,значения данных берем с массива: ");
        for (String flowersMas : flowersMass) System.out.print(flowersMas+"\t");
        System.out.println("\n Содержание коллекции:");
        for (int i = 0; i < flowersMass.length; i++){
            flowersmass.add(flowersMass[i]);
            System.out.printf("%3d\t",i+1);
            System.out.format("%s",flowersMass[i]+"\n");}
    }
}