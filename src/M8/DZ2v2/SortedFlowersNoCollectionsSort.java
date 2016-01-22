package M8.DZ2v2;

import java.util.*;
public class SortedFlowersNoCollectionsSort {

    public static void main(String[] args) {
        TreeSet<Comp> flowersmass = new TreeSet<Comp>();
        String[] flowersMass = { "Flower", "Tultip", "Aster", "Bouquet", "Chamomile", "Rose", "Rosebush"};
        for (int i = 0; i < flowersMass.length; i++)
            System.out.print("["+flowersMass[i]+"]");
        System.out.print("\n\nЗапись массива в коллекцию и сортировка\n\n");
        for (int i = 0; i < flowersMass.length; i++)
            flowersmass.add(new Comp(flowersMass[i]));
        for(Comp e : flowersmass) {
            System.out.print("["+e.str+"]");
        }
    }
}
//чуток долго тупил так как файди в системе тоже были отсортированы по имени
