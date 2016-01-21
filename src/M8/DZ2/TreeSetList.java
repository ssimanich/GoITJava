package M8.DZ2;

import java.util.TreeSet;

class TreeSetList {
    public static void main(String[] args) {
        TreeSet<Comp> list = new TreeSet<Comp>();
        list.add(new Comp("Rosebush"));
        list.add(new Comp("Tultip"));
        list.add(new Comp("Chamomile"));
        list.add(new Comp("Rose"));
        list.add(new Comp("Aster"));
        list.add(new Comp("Bouquet"));
        for(Comp e : list) {
            System.out.println(e.str);
        }
    }

}