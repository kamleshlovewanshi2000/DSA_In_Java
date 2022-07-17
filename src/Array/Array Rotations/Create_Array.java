public class Create_Array {
    public static void main(String[] args) {
        //int arr[];      // Declaring array
        //arr = new int[10];      // allocating memory to array
        //int[] intArray = new int[20]; // Declaring and allocating
                                      // memory to array both are done in one line
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10}; // Array Literal

        // Accessing Array element using for loop.
        for(int i=0;i<arr.length; i++)
        {
            System.out.println("Elements at index "+i+":"+arr[i]);
        }
    }
}
// Time Complexity : O(n)
// Auxiliary Space : O(1)

