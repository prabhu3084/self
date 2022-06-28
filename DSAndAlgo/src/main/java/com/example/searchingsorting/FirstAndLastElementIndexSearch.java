package com.example.searchingsorting;

public class FirstAndLastElementIndexSearch {


    public int[] firstAndLastBruteForce(final int[] arr, int element) {
        final int[] indices = new int[2];
        int index = 0;
        while (index < arr.length) {
            if (element == arr[index]) {
                indices[0] = index;
                break;
            }
            index++;
        }

        if (index < arr.length) {
            int j = index;
                while (arr[index] == arr[j]) {
                    j++;
                    continue;
                }
            indices[1] = j-1;
        }
        return indices;
    }

}
