import java.util.*;
public class BinarySearch {
    public static void print(int arr[],int size)
    {
        System.out.println("The array elements are:");
        for(int x : arr){
            System.out.print(x + "\t");
        }
        System.out.println();
    }
    public static int BS(int arr[],int size,int key)
    {
        int low =0,mid;
        int high = size-1;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(arr[mid]==key)
            {
                return mid+1;
            }
            else if(key<arr[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int [size];
        for(int i =0;i<size;i++)
        {
            System.out.println("Enter array elements at index "+i+":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int key  =sc.nextInt();
        print(arr,size);
        int result =BS(arr,size,key);
        if(result<0)
        {
            System.out.println("Given integer is not present in the array");
        }
        else
        {
            System.out.println("The element "+key+ " location in the array is at index "+result);
        }
        sc.close();
    }
}
