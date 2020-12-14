package _11_count_of_sub_arrays_with_given_sum;

import java.util.HashMap;
import java.util.Map;

public class CountOfSubArraysWithGivenSum {

    public static int countOfSubArray(int[] array, int sum) {
        Map<Integer, Integer> aux = new HashMap<>();
        int prefixSum = 0;
        int zeroSumCount = 0;
        int key;

//        aux.put(prefixSum, 1);
        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];
            aux.putIfAbsent(prefixSum, 0);
            int count = aux.get(prefixSum);
            aux.put(prefixSum, ++count);

            aux.put(prefixSum, ++count);

            if (count > 1) {
                zeroSumCount += (count - 1);
            }
        }
        return zeroSumCount;
    }
}
