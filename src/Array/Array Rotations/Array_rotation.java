public class Array_rotation {
        /*
         int arr[] = {1,2,3,4,5,6,7};
         int d = 2;
         int n = arr.length;

         int i = 1;
         while(i<=d)
         {
             int temp = arr[0];
             for(int j=0; j<n-1; j++)
             {
                 arr[j] = arr[j+1];
             }
             arr[n-1] = temp;
             i++;
         }
        System.out.println("Array after rotation :");
         for(int k=0; k<n; k++)
         {
             System.out.print(arr[k] + " ");
         }

         */

        // Method-2 : A Juggling Algorithm :-

        void lefRotate(int arr[], int d, int n)
        {
            // To handle if d>=n
            d = d % n;
            int i, j, k, temp;
            int g_c_d = gcd(d,n);
            for(i=0;i<g_c_d;i++)
            {
                temp = arr[i];
                j = i;
                while(true)
                {
                    k = j+d;
                    if(k >= n)
                        k = k - n;
                    if (k==i)
                        break;
                    arr[j] = arr[k];
                    j = k;
                }
                arr[j] = temp;
            }
        }
        /*UTILITY FUNCTIONS*/

        /* function to print an array */

        void printArray(int arr[], int size)
        {
            int i;
            for (i=0; i<size; i++)
            {
                System.out.print(arr[i]+" ");
            }
        }

        /* Function to get gcd of a and b */
        int gcd(int a, int b)
        {
            if(b==0)
                return a;
            else
                return gcd(b, a%b);
        }

        // Driver Code
        public static void main(String[] args) {
             Array_rotation rotate = new Array_rotation();
             int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
             rotate.lefRotate(arr, 15,13);
             rotate.printArray(arr,13);
        }

    public static class CloningOfArrays {
        public static void main(String[] args) {
            /*  Deep Copy:
                When you clone a single-dimensional array, such as Object[],
                a “deep copy” is performed with the new array containing copies
                of the original array’s elements as opposed to references .
            */

           /*
            int arr[] = {1,2,3,4,5,};
            int cloneArray[] = arr.clone();
            // will print false as deep copy is created
            // for one-dimensional array.
            System.out.println(arr==cloneArray);
            // Printing clone array elements
            for(int i=0; i<cloneArray.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            */

            /*  Shallow Copy:
            A clone of a multi-dimensional array (like Object[][])
            is a “shallow copy,” however, which is to say that it
            creates only a single new array with each element array
            a reference to an original element array, but subarrays are shared.
            */

            int intArray[][] = { { 1, 2, 3 }, { 4, 5 } };

            int cloneArray[][] = intArray.clone();

            // will print false
            System.out.println(intArray == cloneArray);

            // will print true as shallow copy is created
            // i.e. sub-arrays are shared
            System.out.println(intArray[0] == cloneArray[0]);
            System.out.println(intArray[1] == cloneArray[1]);
        }
    }
}
