public class CloningOfArrays {
    public static void main(String[] args) {
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
    }
}
