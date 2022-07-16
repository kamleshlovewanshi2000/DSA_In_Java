import java.io.*;
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

        // Method - A Juggling Algorithm :
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
             int arr[] = {1,2,3,4,5,6,7};
             rotate.lefRotate(arr, 2,7);
             rotate.printArray(arr,7);
        }
}
