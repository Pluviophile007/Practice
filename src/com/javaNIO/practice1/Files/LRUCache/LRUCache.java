package com.javaNIO.practice1.Files.LRUCache;

import java.util.*;

public class LRUCache {

    private final int CACHE_SIZE ;

    private Set<Integer> set;

    private Deque<Integer> deque;
    public LRUCache(int i) {
        CACHE_SIZE = i;
        set = new HashSet<>();
        deque = new LinkedList<>();
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(4);
        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);
        cache.refer(5);
        cache.display();
    }

    private void refer(int i) {

        if (set.contains(i))
        {
            deque.remove(i);
        }
        else if (deque.size() == CACHE_SIZE)
        {
            int last = deque.removeLast();

        }
        deque.push(i);
        set.add(i);

    }


    private void display()
    {
        deque.stream().forEach(System.out::print);
    }
}
