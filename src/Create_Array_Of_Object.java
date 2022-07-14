// Java program to illustrate creating
//  an array of objects
// Create a class Student
import java.util.*;
class Student{
    public  int roll_no;
    public String name;
    Student(int roll_no,String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Create_Array_Of_Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr; // Declaring array of object
        arr = new Student[5];
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter the roll no of Student:");
            int r = sc.nextInt();
            System.out.println("Enter the name of Student:");
            String n = sc.nextLine();
            n = sc.nextLine();
            arr[i] = new Student(r,n);
        }
        // Accessing the elements of an object array
        for(int i=0; i<arr.length;i++)
        {
            System.out.println("Element at "+i+" : "+ arr[i].roll_no +" " + arr[i].name);
        }
    }
}
