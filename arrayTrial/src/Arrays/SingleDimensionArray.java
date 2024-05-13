package Arrays;

/**
 * 1. insert into an Array
 * 2. Traverse an Array
 * 3. Delete Array for both (specific value as well as the whole array)
 * 4. Search for an element in an array
 */
public class SingleDimensionArray {
    private int[] arr;

    // Constructor to initialize the array
    public SingleDimensionArray(int size) {
        arr = new int[size];
        // Initialize array elements with Integer.MIN_VALUE to indicate empty slots
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Method to insert a value into the array
    public void insert(int location, int valueToInsert) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array" + e);
        }
    }

    // Method to traverse an array
    public void traverse() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index: " + arr[i]);
        }
    }

    // Method to delete a specific value
    public void delete(int location) {
        try {
            if (arr[location] != Integer.MIN_VALUE) {
                arr[location] = Integer.MIN_VALUE;
                System.out.println("Successfully deleted");
            } else {
                System.out.println("Value at this location is already deleted");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array" + e);
        }
    }

    // Method to search array
    public void search(int item) {
        try {
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == item) {
                    System.out.println("Value found at index " + i + ": " + arr[i]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println(item + " is not found.");
            }
        } catch(Exception e) {
            System.out.println("An error occurred during search: " + e);
        }
    }

    // Method to delete the entire array
    public void deleteArray() {
        arr = null;
        System.out.println("Array deleted successfully");
    }

    // Overriding toString to print the array
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
