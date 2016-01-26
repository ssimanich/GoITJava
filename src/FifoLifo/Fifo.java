package FifoLifo;

import java.util.*;

public class Fifo {
    public static void main(String[] args){
        String[] data={"one","two","three","four","five","six","seven","eight","nine","ten"};
        Queue<String> list = new LinkedList<>();
        Collections.addAll(list, data);
        System.out.println(list+"\n");
        while (!list.isEmpty()){
            list.poll();
            System.out.println(list);}
    }
}
