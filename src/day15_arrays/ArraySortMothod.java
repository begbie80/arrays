package day15_arrays;

import java.util.Arrays;

public class ArraySortMothod {
    public static void main(String[] args) {


       double prices []= {1.99,
                         0.75,
                         9.99,
                            5,
                           99,
                         5.32};

        System.out.println(Arrays.toString(prices));
        Arrays.sort(prices);
        System.out.println(prices);

        System.out.println(prices[0]);
        System.out.println(prices[4]);
    }



}
