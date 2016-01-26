package FifoLifo;

import java.util.Deque;
import java.util.LinkedList;

public class Lifo {
    public static void main(String[] args){
        String[] data={"one","two","three","four","five","six","seven","eight","nine","ten"};
        Deque<String> list = new LinkedList<String>();
        for(int i=0;i<data.length;i++) {
            list.addFirst(data[i]);
            System.out.println(list);
        }
      System.out.println(list+"\n");
        while (!list.isEmpty()){
            list.poll();
            System.out.println(list);}
    }
}
