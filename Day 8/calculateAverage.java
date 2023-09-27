public class calculateAverage {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 2, 2, 2};
        int averageResult = calculateAverage(numbers);
        System.out.println("Average of numbers is: " + averageResult);
    }

    /**
     * Calculates the average of given numbers.
     *
     * @param numbers Array of integers
     * @return Average of the given numbers
     */
    static int calculateAverage(int... numbers) {
        int sum = 0;

        // Calculate the sum of all numbers
        for (int num : numbers) {
            sum += num;
        }

        // Calculate the average
        return sum / numbers.length;
    }
}
