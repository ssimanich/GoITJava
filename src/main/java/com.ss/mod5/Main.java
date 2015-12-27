package com.ss.mod5;

import java.util.Arrays;

/**
 * Created by ss on 27.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {2,-1,5,3,1};
        int[] sort = QuickSort.sort(arr, 0, 3);
        System.out.println(Arrays.toString(sort));
    }
}
