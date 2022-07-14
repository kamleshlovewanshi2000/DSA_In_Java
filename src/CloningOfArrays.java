public class CloningOfArrays {
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
