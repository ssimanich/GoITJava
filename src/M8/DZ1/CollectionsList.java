package M8.DZ1;
import java.util.ArrayList;

public class CollectionsList {
    public static void main(String[] args) {
        ArrayList<String> flowersmass = new ArrayList();
        String[] flowersMass = {"Aster","Bouquet","Chamomile","Flower","Rose","Rosebush","Tultip"};
        for (int i = 0; i < flowersMass.length; i++) {
            flowersmass.add(flowersMass[i]);
            String res = flowersmass.get(i);
            System.out.println(res);
        }
    }
}