package FifoLifo;

import java.util.ArrayDeque;
import java.util.Deque;


public class Lifo {
    public static void main(String[] args){
        String[] data={"one","two","three","four","five","six","seven","eight","nine","ten"};
        Deque<String> list = new ArrayDeque<>();
        for(int i=0;i<data.length;i++) {
            list.addFirst(data[i]);
            System.out.println(list);
        }
      System.out.println("\n"+list);
        while (!list.isEmpty()){
            list.poll();
            System.out.println(list);}
    }
}
