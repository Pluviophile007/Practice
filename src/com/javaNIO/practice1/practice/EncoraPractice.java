package com.javaNIO.practice1.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EncoraPractice {
//    public static int ArrayChallenge(int[] arr) {
//        // code goes here
//        Set<Integer> set = new HashSet<>();
//        int totalDuplicate = 0;
//        for (int i = 0; i < arr.length; i++) {
//            totalDuplicate = getTotalDuplicate(arr, set, totalDuplicate, i);
//        }
//
//        viaJava8(arr, set);
//        return totalDuplicate;
//    }

    public static int ArrayChallengeViaJava8(int[] arr) {
        // code goes here

        return viaJava8(arr);
    }
    private static int viaJava8(int[] arr) {
        Set<Integer> set = new HashSet<>();
        final CustomIncrement customIncrement = new CustomIncrement();
        Arrays.stream(arr).forEach(i-> {
            if (set.contains(i)) {
                customIncrement.setCounter(customIncrement.getCounter()+1);
            } else {
                set.add(i);
            }
        });
        return customIncrement.getCounter();
    }

    private static int getTotalDuplicate(int[] arr, Set<Integer> set, int totalDuplicate, int i) {
        if (set.contains(arr[i])) {
            totalDuplicate = totalDuplicate + 1;
        } else {
            set.add(arr[i]);
        }
        return totalDuplicate;
    }

    public static void main (String[] args)
    {
        int array[] = {2,3,4,3,1};
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(viaJava8(array));
    }




}
