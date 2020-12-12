package _8_insertion_sort;

public class Solution {

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int newElement= array[i];
            for (int j = i-1; j >=0 ; j--) {
            }
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        return array;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
