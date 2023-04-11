package luxoft.summation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LuxoftPractice {
    public static void main(String[] args) {
//        OnSquareSolutions();
        OOf1Complexity();

    }

    private static void OOf1Complexity() {
        List<Integer> list = Arrays.asList(2,7,9,8,5);
        Set<Integer> hashSet = new HashSet<>(list);
        int target = 9;
        int firstIndex = -1;
        int secondIndex = -1;
        int valueToBeFound = -1;
        boolean seconsElementFound = false;
        for (int i = 0; i< list.size()-1; i++)
        {
            if (seconsElementFound && list.get(i) == valueToBeFound)
            {
                secondIndex = i;
            }
            if (firstIndex == -1  && (seconsElementFound = hashSet.contains(target- list.get(i))))
            {
                valueToBeFound = target-list.get(i);
                firstIndex = i;
            }

        }
        System.out.println("Elements are "+list.get(firstIndex)+" "+list.get(secondIndex));
    }

    private static void OnSquareSolutions() {
        // O(n2)
        List<Integer> list = Arrays.asList(2,7,9,8,5);
        int target = 10;
        int firstIndex=0;
        int secondIndex=0;
        for (int i = 0; i < list.size()-2; i++)
        {
            int num = list.get(i);
            firstIndex = i;
            for (int j=i+1; j< list.size()-1;j++)
            {
                 secondIndex = 0;
                if (list.get(j) == target-num)
                {
                    System.out.println("Finding Second Index as per target value " +list.get(j));
                    secondIndex = j;
                    break;
                }
            }
            if (secondIndex != 0)
                break;
        }
        System.out.println("First Index = "+firstIndex + "  Second Index = "+secondIndex + " values are "
                +list.get(firstIndex) + " "+list.get(secondIndex));
    }
}
