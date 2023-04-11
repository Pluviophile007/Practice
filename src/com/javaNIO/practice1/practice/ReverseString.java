package com.javaNIO.practice1.practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("MayankTripathi".chars()
                .mapToObj(c -> (char)c)
                .reduce("", (s,c) -> {
                    System.out.println("  s=  "+s+"  c = "+c );
                    return c+s;
                    }, (s1,s2) ->
                {
                    System.out.println("  s1=  "+s1+"  s2 = "+s2 );
                    return  s2+s1;
                }));
    }

}
