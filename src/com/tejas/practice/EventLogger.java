package com.tejas.practice;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class EventLogger {
    static Map<Long, Integer> map = new ConcurrentHashMap<>();
    public  void logEvent() {
        if (map.containsKey(Instant.now().getEpochSecond()))
        {
            long time = Instant.now().getEpochSecond();
           Integer count =  map.get(time);
           if (count == null)
           {
               count = new Integer(0);
           }
           map.put(time, count++);
        }
    }

    public void printLastGivenSizeWindowEventCount(int windowSize)
    {
        long l = Instant.now().getEpochSecond();
        Integer currentCount = map.get(l);
        Integer lastWindowCount = map.get(windowSize);
        System.out.println("Total number of messages = "+ (lastWindowCount-currentCount));
    }
}
