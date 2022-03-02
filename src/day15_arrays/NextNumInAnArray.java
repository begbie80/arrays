package day15_arrays;

import java.util.Arrays;

public class NextNumInAnArray {
    public static void main(String[] args) {

        //              0 1 2 3 4 5 6 7   index position
        int numbers[]= {3,1,4,59,6,7,2,1};

//        Arrays.sort(numbers);

        int maxNum = numbers[0];

        for (int i = 0 ; i < numbers.length; i++){
//            System.out.println(numbers[i]);

            if(numbers[i] > maxNum ){
                maxNum = numbers[i];
            }


        }

        System.out.println(maxNum);



    }
}
