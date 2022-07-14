import java.util.Scanner;
public class CreateMultidimentionArray {
    public static void main(String[] args) {
        //Declaring and Initializing 2D array
        /* int arr[][] = {{2,5,7},{3,9,8},{7,5,3}};

        // Printing 2D array
        for(int i=0; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } */

        // Getting input for 2-D Array
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the element of 2-D Array size of "+arr.length+" :");
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr.length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // Accessing elements of 2-D array
        System.out.println("Output of 2-D Array: ");
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
