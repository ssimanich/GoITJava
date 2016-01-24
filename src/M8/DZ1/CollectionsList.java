package M8.DZ1;

import java.util.ArrayList;
import java.util.List;

public class CollectionsList{
    public static void main(String[] args) {
        List<Object> flowersmass = new ArrayList();
        String[] flowersMass = { "Flower", "Tultip", "Aster", "Bouquet", "Chamomile", "Rose", "Rosebush"};
        for (int i = 0; i < flowersMass.length; i++)
            flowersmass.add(flowersMass[i]);
        System.out.println(flowersmass);
    }
}