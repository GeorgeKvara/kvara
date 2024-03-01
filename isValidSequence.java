public class isValidSequence {
    public static void main(String[] args) {
        int[] array1 = {5,1,22,25,6,-1,8,10};
        int[] sequence1 = {1,6,-1,10};
        System.out.println("Test Case 1 is valid sequence: " + isValidSequence(array1, sequence1) + ", This should be true."); // Output: true


        int[] array2 = {1,2,3,4,5};
        int[] sequence2 = {3,5};
        System.out.println("Test Case 2 is valid sequence: " + isValidSequence(array2, sequence2) + ", This should be true."); // Output: true

        int[] array3 = {5,1,22,25,6,-1,8,10};
        int[] sequence3 = {5,22,-1};
        System.out.println("Test Case 3 is valid sequence: " + isValidSequence(array3, sequence3) + ", This should be true."); // Output: true

        int[] array4 = {1, 2, 3, 4, 5};
        int[] sequence4 = {6, 2, 4};
        System.out.println("Test Case 4 is valid sequence: " + isValidSequence(array4, sequence4) + ", This should be false."); // Output: false
    }

    public static boolean isValidSequence(int[] array, int[] sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;

        while (arrayIndex < array.length && sequenceIndex < sequence.length) {
            if (array[arrayIndex] == sequence[sequenceIndex]) {
                sequenceIndex++;
            }
            arrayIndex++;
        }

        return sequenceIndex == sequence.length;
    }
}
