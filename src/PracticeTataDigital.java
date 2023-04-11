import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeTataDigital {
    public static void main(String[] args) {
        // {1,5,10,20,40,80}
        // {6,7,20,80,100}
        // {3,4,15,20,30,70,80,120}
        List<Integer> list1 = Arrays.asList(1,5,10,20,40,80);
        List<Integer> list2 = Arrays.asList(6,7,20,80,100);
        List<Integer> list3 = Arrays.asList(3,4,15,20,30,70,80,120);

        Map<Integer, Integer> storageMap = new HashMap<>();

        for (Integer i : list1)
        {
            checkOccurances(storageMap, i);
        }
        for (Integer i : list2)
        {
            checkOccurances(storageMap, i);
        }
        for (Integer i : list3)
        {
            checkOccurances(storageMap, i);
        }
        System.out.println(storageMap);
        findCommonElementsInAllLists(storageMap);
    }

    private static void findCommonElementsInAllLists(Map<Integer, Integer> storageMap) {
        System.out.println("Common Elements");
        storageMap.entrySet().stream().filter((e)->e.getValue() == 3).forEach(System.out::println);
    }

    private static void checkOccurances(Map<Integer, Integer> storageMap, Integer i) {
        Integer count = storageMap.get(i);
        if (count == null)
            storageMap.put(i, 1);
        else
            storageMap.put(i, ++count);
    }
}
