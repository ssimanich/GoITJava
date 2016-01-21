package M8.DZ2;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedFlowers{
    public static void main(String[] args) {
        ArrayList<String> flowersmass = new ArrayList<String>();
        String[] flowersMass = { "Flower", "Tultip", "Aster", "Bouquet", "Chamomile", "Rose", "Rosebush"};
        for (int i = 0; i < flowersMass.length; i++)
            flowersmass.add(flowersMass[i]);
        System.out.println(flowersmass);
        SortedSet<String> set = new TreeSet<String>(flowersmass);
        System.out.print("Отсортированная колекция \n"+set);
    }
}
//чуток долго тупил так как файди в системе тоже были отсортированы по имени
//так что задержался