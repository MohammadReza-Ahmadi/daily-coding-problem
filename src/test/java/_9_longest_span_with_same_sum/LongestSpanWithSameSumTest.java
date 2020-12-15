package _9_longest_span_with_same_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSpanWithSameSumTest {

    @Test
    public void test_6() {
        int[] arr1 = new int[]{0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = new int[]{1, 1, 1, 1, 1, 0, 1};
        int expected = 6;
        Assertions.assertEquals(expected, LongestSpanWithSameSum.calcLongestSpan(arr1, arr2));
    }

}