import java.util.Scanner;
public class BinarySearchRecursive {
    public static void print(int arr[])
    {
        System.out.println("The array elements are:");
        for(int x : arr){
            System.out.print(x + "\t");
        }
        System.out.println();
    }
    public static int  BSRecursive(int arr[],int low,int high,int key)
    {
        if(low<=high)
        {
            int mid = (low+high)/2;
            if(key==arr[mid])
            {
                return mid+1;
            }
            else if(key<arr[mid])
            {
                return BSRecursive(arr,low,mid-1,key);
            }
            return BSRecursive(arr,mid+1,high,key);
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<size;i++)
        {
            System.out.print("Enter the element at index "+i+":");
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to search in the array:");
        int key = sc.nextInt();
        print(arr);
        int result  = BSRecursive(arr,0,size-1,key);
        if(result>-1)
        {
            System.out.println("The element "+ key+" is found at index "+result+" location");
        }
        else
        {
            System.out.println("Element not found in the array..");
        }
        sc.close();
    }
}
