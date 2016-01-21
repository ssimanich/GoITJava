package M8.DZ1;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsList {
    public static void main(String[] args) {
        ArrayList<String> flowersmass = new ArrayList<String>();
        String[] flowersMass = {"Tultip","Aster","Bouquet","Chamomile","Flower","Rose","Rosebush","Tultip"};
        for (int i = 0; i < flowersMass.length; i++) {
            flowersmass.add(flowersMass[i]);}
        System.out.println(flowersmass);
        SortedSet<String> set = new TreeSet<String>(flowersmass);
        System.out.print(set);


    }
}