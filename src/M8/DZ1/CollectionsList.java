package M8.DZ1;

import java.util.ArrayList;

public class CollectionsList{
    public static void main(String[] args) {
        ArrayList<String> flowersmass = new ArrayList<String>();
        String[] flowersMass = { "Flower", "Tultip", "Aster", "Bouquet", "Chamomile", "Rose", "Rosebush"};
        for (int i = 0; i < flowersMass.length; i++)
            flowersmass.add(flowersMass[i]);
        System.out.println(flowersmass);
    }
}