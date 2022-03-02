package day15_arrays;

import java.util.Arrays;

public class WordCount {
    public static void main(String[] args) {
        String str = "Ukraine announces postage stamp creation contest; examples include image of Zelenskyy spanking Putin";

        String arr[] = str.split(" ");

        System.out.println(arr.length);

        for (String word : arr) {
            System.out.println(word);
        }


        String arr2[] = str.split(";");

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);


        String transaction = "BUY EURO SELL USD";

        String expectedStr = "BUY USD SELL EURO";

        String arr3[] = transaction.split(" ");

        System.out.println(Arrays.toString(arr3));
        String str3 =  arr3[2]+ " " + arr3[0] + " "+ arr3[1];

        System.out.println(str3.equalsIgnoreCase(expectedStr));



    }
}

