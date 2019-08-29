package com.training;

/**
 * {@link RotateArray} has methods to rotate a given array by a certain number of
 * positions.
 * {@link RotateArray#rotate(int[], int)} rotates the array using an efficient
 * approach.
 * {@link RotateArray#rotateBrute(int[], int)} rotates the array using a brute
 * force approach.
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class RotateArray {
    /**
     * Returns a rotated array calculated using an efficient approach.
     *
     * @param input string to be tested
     * @param numberOfPlacesToRight number of places array needs to be rotated
     * @return rotated array
     */
    public int[] rotate(int input[], int numberOfPlacesToRight) {
        if (numberOfPlacesToRight < 0) {
            return null;
        }

        if (numberOfPlacesToRight > input.length) {
            numberOfPlacesToRight %= input.length;
        }

        numberOfPlacesToRight = input.length - numberOfPlacesToRight - 1;

        // reverse the first half
        reverse(input, 0, numberOfPlacesToRight);

        // reverse the second half
        reverse(input, numberOfPlacesToRight + 1, input.length - 1);

        // reverse the entire array
        reverse(input, 0, input.length - 1);

        return input;
    }

    private void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Returns a rotated array calculated using a brute force approach.
     *
     * @param input string to be tested
     * @param numberOfPlacesToRight number of places array needs to be rotated
     * @return rotated array
     */
    public int[] rotateBrute(int input[], int numberOfPlacesToRight) {
        // rotate the array element by element numberOfPlacesToRight times
        for (int i = 0; i < numberOfPlacesToRight; i++) {
            // assign first to a temp variable
            int temp = input[0];
            // assign last element to the first element
            input[0] = input[input.length - 1];
            // shift all other elements forward by one position
            for (int j = input.length - 1; j >= 1; j--) {
                input[j] = input[j - 1];
            }
            // assign temp to the first element
            input[1] = temp;
        }

        return input;
    }
}
