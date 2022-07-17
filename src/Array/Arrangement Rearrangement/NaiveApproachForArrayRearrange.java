import java.util.Arrays;
class ArrayRearrangement {
    /*
    public static void fixArray(int arr[], int n) {
        int i, j, temp;
        // Iterate over the array
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                // Check is any arr[j]
                // exists such that
                // arr[j] is equal to i
                if (arr[j] == i) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        for (i = 0; i < n; i++) {
            // if not present
            if (arr[i] != i) {
                arr[i] = -1;
            }
        }
        // Print the Output
        System.out.println(" Array after Rearranging :");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Drive Code
    public static void main(String[] args) {
        int n, arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        n = arr.length;
        // Function Calling
        fixArray(arr, n);
    }

    //Time Complexity: O(n2)
    //Auxiliary Space: O(1)
    */

    public static void main(String[] args)
    {
        int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        for (int i = 0; i < arr.length;)
        {
            if (arr[i] >= 0 && arr[i] != i)
            {
                int ele = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = ele;
            }
            else
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // Time Complexity: O(n)
    //Auxiliary Space: O(1)
}