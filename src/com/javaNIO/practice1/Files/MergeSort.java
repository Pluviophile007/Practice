package com.javaNIO.practice1.Files;

import java.util.Arrays;

public class MergeSort {

    static  int global = 0;
    public static void main(String[] args) {
        int array[] = new int[]{10,2,6,8, 13, 18};
       System.out.println("Un-Sorted Arrays is "+Arrays.toString(array));
       mergeSorting(array, array.length);
       System.out.println("Sorted Arrays is "+Arrays.toString(array));

    }

    private static void mergeSorting(int[] array, int length) {
        if (length<2)
        {
            return ;
        }

        int mid = length/2;

        int left[] = new int[mid];
        for (int i = 0; i< mid; i++)
        {

            left[i] = array[i];

        }

        int right[] = new int[length-mid];
        for (int i = mid; i< length; i++)
        {
            right[i-mid] = array[i];
        }
        System.out.println("STEP "+ global++);
        System.out.println("Left Array = "+Arrays.toString(left));
        System.out.println("Right Array = "+Arrays.toString(right));
        mergeSorting(left, left.length);
        mergeSorting(right, right.length);

        sortArrays(array, left, right, left.length, right.length);
    }

    private static void sortArrays(int[] array, int[] left, int[] right, int leftLength, int rightLength) {

        int i, j, k =0;
        i=0;
        j=0;
        while (i < leftLength && j < rightLength)
        {
            if (left[i]<=right[j])
            {
                array[k++] = left[i++];
            }
            else {
                array[k++] = right[j++];
            }
        }

        while (i < leftLength)
        {
            array[k++] = left[i++];
        }

        while (j< rightLength)
        {
            array[k++] = right[j++];
        }
    }

}
