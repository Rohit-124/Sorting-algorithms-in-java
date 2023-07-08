import java.util.*;
class SequentialSearch
{
    public static int LinearSearch(int arr[],int size,int key)
    {
        int found =0;
        for(int i=0;i<size;i++)
        {
            found++;
            if(arr[i]==key)
            {
                System.out.print("Element found at index ");
                return (found);
            }
        }
        System.out.print("Element not found in the array ");
        return -1;
    }
    public static void print(int arr[],int size)
    {
        System.out.println("The elements of array are:");
        for(int i=0;i<size;i++)
        {
        System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        int arr[]= new int[size];
        for(int i =0;i<size;i++){
            System.out.println("Enter the element at index "+(i+1)+":");
            arr[i]= sc.nextInt();
        } 
        System.out.print("Enter the element you want to search in array:");
        int key =sc.nextInt();
        print(arr,size);
        System.out.println(LinearSearch(arr,size,key));
        sc.close();
    }
}