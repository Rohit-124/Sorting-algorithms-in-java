import java.util.Scanner;
public class SequentialSearchRecursive {
    public static int  LinearSearchRec(int arr[],int size,int intialpoint,int key)
    {
        if(intialpoint>=size){
            return -1;
        }
        else if(arr[intialpoint]==key){
            return intialpoint+1;
        }
        return LinearSearchRec(arr, size, intialpoint+1, key);
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
        int result = LinearSearchRec(arr, size, 0, key);
        if(result == -1)
        {
            System.out.println("Element not found in the array..");
        }
        else 
        {
            System.out.println("Element fount at index:"+result);
        }
        sc.close();
    }
}

