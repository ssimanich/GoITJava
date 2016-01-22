package M8.DZ2v1;

import java.util.*;

public class SortedFlowers{
    public static void main(String[] args) {
        ArrayList<String> flowersmass = new ArrayList<String>();
        String[] flowersMass = { "Flower", "Tultip", "Aster", "Bouquet", "Chamomile", "Rose", "Rosebush"};
        for (int i = 0; i < flowersMass.length; i++)
            flowersmass.add(flowersMass[i]);
        System.out.println(flowersmass);
        System.out.println("Запись  коллекции ArrayList в коллекцию TreeSet и сортировка");
        TreeSet<String> flowermassSort = new TreeSet<String>(flowersmass);
        System.out.println(flowermassSort);
        }
    }

