package com.javaNIO.practice1.practice;

import java.util.*;
import java.util.stream.Collectors;

public class SortByValuesInHashMao {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mayank", 1111);
        map.put("Shashank", 1234);
        map.put("Rajan", 8643);
        map.put("Ankur", 6543);
        map.put("Shivam", 4556);map.put("VArun", 643335);

         List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
         list.sort(Map.Entry.comparingByValue());
        System.out.println(list);



    }
}
