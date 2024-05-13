package Arrays;

public class Main {
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

        // search an item in the array
        singleDimensionArray.search(3);

        // delete entire array
        singleDimensionArray.deleteArray();
    }
}
