import java.util.Scanner;
public class SelectionSort {
    public static void printArr(int arr[])
    {
        for(int x: arr)
        {
            System.out.print(x+"\t");
        }
        System.out.println();
    }
 
    public static void SelectionAlgo(int arr[])
    {
        int n = arr.length;
        int min,temp,i,j;
        for(i=0;i<n-1;i++)
        {
            min = i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            temp =  arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array ");
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element at index "+i+":");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements before sorting:");
        printArr(arr);
        System.out.println("The array elements after sorting : ");
        SelectionAlgo(arr);
        printArr(arr);
        sc.close();
    }
}
