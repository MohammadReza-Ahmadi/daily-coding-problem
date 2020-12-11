package utils;

import java.util.List;

public class MyUtils {

    public static int[] convertIntegerListToArray(List<Integer> integerList) {
        return integerList.stream().mapToInt(i -> i).toArray();
    }
}
