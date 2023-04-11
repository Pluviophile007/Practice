package com.javaNIO.practice1.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaHungry {
    public static void main(String[] args) {
        String str1 = "Java Hungry Blog Alive is Awesome";

        str1.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(s->s.getValue() > 1L).forEach(System.out::println);

    }
}
