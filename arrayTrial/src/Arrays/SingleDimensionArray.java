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
        // Initialize array elements with Integer.MIN_VALUE tp indicate empty slots
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
            System.out.println(arr[i]);
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

    // Method to delete the entire array
    public void deleteArray() {
        arr = null; // Reassign the array reference to null
        System.out.println("Array deleted successfully");
    }



    // In Java, when you try to print an object using System.out.println, it implicitly calls the toString method of
    // that object. However, it seems like you don't have a toString method defined in your SingleDimensionArray class
    // to properly print the array.


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

    public static void main(String[] args) {
        // create the object of the class
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(8);
        singleDimensionArray.insert(0, 1);
        singleDimensionArray.insert(1, 2);
        singleDimensionArray.insert(2, 3);
        singleDimensionArray.insert(3, 4);
        singleDimensionArray.insert(4, 5);
        singleDimensionArray.insert(5, 3);
        singleDimensionArray.insert(6, 4);
        singleDimensionArray.insert(7, 5);
        // print all numbers within the array
        singleDimensionArray.traverse();
        // print the array
        System.out.println(singleDimensionArray);
        // delete an item from the array
        singleDimensionArray.delete(1);
        System.out.println(singleDimensionArray);
        // delete entire array
        singleDimensionArray.deleteArray();
    }
}
