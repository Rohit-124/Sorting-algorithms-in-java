import java.util.Scanner;
public class InsertionSort {
    static void printArr(int arr[])
    {
        for(int x:arr)
        {
            System.out.print(x+"\t");
        }
        System.out.println();
    }
    static void InsertSort(int arr[])
    {
        int key,j;
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
            key = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] =  arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int  n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array");
    for(int i =0;i<n;i++)
    {
        System.out.print("Enter element at index "+i+" position:");
        arr[i] = sc.nextInt();
    }
    System.out.println("The elements of an array before sorting.");
    printArr(arr);
    InsertSort(arr);
    System.out.println("The elements of an array after sorting are:");
    printArr(arr);
    sc.close();
    }
}