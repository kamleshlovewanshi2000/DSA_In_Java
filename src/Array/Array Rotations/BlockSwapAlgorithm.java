import javax.imageio.stream.ImageInputStream;

class BlockSwapAlgo{
    public static void leftRotate(int arr[], int d, int n){
        leftRotateRec(arr, 0, d, n);
    }
    public static void leftRotateRec(int arr[], int i, int d, int n) {
        // If number of elements to be rotated
        // is exactly half of array size
        if (d == 0 || d == n)
            return;

        // if number of elements to be rotated is
        // exactly half of array size
        if (n - d == d) {
            swap(arr, i, n - d + i, d);
            return;
        }
        // If A is shorter
        if (d < n - d) {
            swap(arr, i, n - d + i, d);
            leftRotateRec(arr, i, d, n - d);
        }
        // If B is shorter
        else {
            swap(arr, i, d, n - d);
            // This is tricky
            leftRotateRec(arr, n - d + i, 2 * d - n, d);
        }
        // Utility Function
        // function to print an array
    }
        public static void printArray(int arr[], int size)
        {
            int i;
            for(i=0; i<size; i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
        /* This funtion swaps d elenemts
         starting at index fi with d elements
         starting at index si */
        public static void swap(int arr[], int fi, int si, int d)
        {
            int i, temp;
            for(i=0; i<d; i++)
            {
                temp = arr[fi + i];
                arr[fi + i] = arr[si + i];
                arr[si + i] = temp;
            }
        }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        leftRotate(arr, 2, 7);
        printArray(arr,7);
    }
}