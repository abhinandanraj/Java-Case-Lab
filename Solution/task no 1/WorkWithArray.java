import java.util.Arrays;
import java.util.Scanner;

public class WorkWithArray {

    // Function to fill an integer array with random values within a specified range
    public static void fillArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * (max - min + 1));
        }
    }
    // Function to find the maximum value in an integer array
    public static int max(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Function to find the minimum value in an integer array
    public static int min(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Function to calculate the average of an integer array
    public static double average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    // Function to sort an integer array in ascending order
    public static void sortAscending(int[] array) {
        Arrays.sort(array);
    }

    // Function to sort an integer array in descending order
    public static void sortDescending(int[] array) {
        Arrays.sort(array);
        reverse(array);
    }

    // Helper function to reverse an integer array
    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    //---------------------------------------------------------------------------------------------
    // Overloaded function to fill a double array with random values within a specified range
    public static void fillArray(double[] array, double min, double max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (Math.random() * (max - min));
        }
    }


    // Overloaded function to find the maximum value in a double array
    public static double max(double[] array) {
        double max = array[0];
        for (double value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }


    // Overloaded function to find the minimum value in a double array
    public static double min(double[] array) {
        double min = array[0];
        for (double value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }


    // Overloaded function to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Overloaded function to sort a double array in ascending order
    public static void sortAscending(double[] array) {
        Arrays.sort(array);
    }

    // Overloaded function to sort a double array in descending order
    public static void sortDescending(double[] array) {
        Arrays.sort(array);
        reverse(array);
    }


    // Helper function to reverse a double array
    private static void reverse(double[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from the user
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Error: Array size must be greater than zero.");
            return;
        }

        // Get range boundaries from the user
        System.out.print("Enter minimum boundary: ");
        int minBound = scanner.nextInt();
        System.out.print("Enter maximum boundary: ");
        int maxBound = scanner.nextInt();

        if (maxBound < minBound) {
            System.out.println("Error: Maximum boundary must be greater than or equal to minimum boundary.");
            return;
        }

        // Choose between integer and fractional array
        System.out.print("Enter 'i' for integer array or 'd' for double array: ");
        char type = scanner.next().charAt(0);

        if (type == 'i') {
            // Integer array processing
            int[] intArray = new int[size];
            fillArray(intArray, minBound, maxBound);

            System.out.println("Array: " + Arrays.toString(intArray));
            System.out.println("Max: " + max(intArray));
            System.out.println("Min: " + min(intArray));
            System.out.println("Average: " + average(intArray));

            sortAscending(intArray);
            System.out.println("Sorted Ascending: " + Arrays.toString(intArray));

            sortDescending(intArray);
            System.out.println("Sorted Descending: " + Arrays.toString(intArray));

        } else if (type == 'd') {
            // Double array processing
            double[] doubleArray = new double[size];
            fillArray(doubleArray, minBound, maxBound);

            System.out.println("Array: " + Arrays.toString(doubleArray));
            System.out.println("Max: " + max(doubleArray));
            System.out.println("Min: " + min(doubleArray));
            System.out.println("Average: " + average(doubleArray));

            sortAscending(doubleArray);
            System.out.println("Sorted Ascending: " + Arrays.toString(doubleArray));

            sortDescending(doubleArray);
            System.out.println("Sorted Descending: " + Arrays.toString(doubleArray));

        } else {
            System.out.println("Error: Invalid array type chosen.");
        }

        scanner.close();
    }
}
