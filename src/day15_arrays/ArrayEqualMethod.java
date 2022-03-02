package day15_arrays;

import java.util.Arrays;

public class ArrayEqualMethod {
    public static void main(String[] args) {



        int arr1 []={1,2,3,4};
        int arr2 []= {1,2,3,4};
        int arr3 []= {4,3,2,1};
        int arr4 []= {1,2,3};

//        System.out.println(arr1==arr2);
//        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1,arr2));

        System.out.println(Arrays.equals(arr1,arr3));

        Arrays.sort(arr3);

        System.out.println(Arrays.equals(arr1,arr3));

        System.out.println(Arrays.equals(arr1,arr4));



    }





}
