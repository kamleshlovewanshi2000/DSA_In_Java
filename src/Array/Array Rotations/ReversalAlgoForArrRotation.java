public class ReversalAlgoForArrRotation {
    // Reversal Algorithm of Array Rotation
    static  void lefRotate(int arr[], int d){
        if (d==0)
            return;

        int n = arr.length;
        // In case the rotating factor is
        // greater than array length.
        d = d%n;
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);
    }
    /* Fuction to reverse arr[] from index start to end */
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while(start<end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    //Utility Function
    // Function to print an array
    static  void printArray(int arr[])
    {
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    // Drive Code to test above functions
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 9;
        lefRotate(arr,d);
        printArray(arr);
    }
}

//Time Complexity : O(n)

//Auxiliary Space: O(1)