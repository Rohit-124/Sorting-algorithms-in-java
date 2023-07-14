import java.util.Scanner;

public class BubbleSort {
    public static void print(int arr[]){
        System.out.println("The array elements are:");
        for(int x:arr)
        {
            System.out.print(x+"\t");
        }
        System.out.println();
    }
    public static void Sort(int arr[],int n)
    {
        int flag;
        for(int i=0;i<n-1;i++)
        {
            flag=0;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    flag =1;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(flag==0){
                break;
            } 
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,arr[];
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element at index "+i+":");
            arr[i] = sc.nextInt();
        }
        print(arr);
        Sort(arr,n);
        System.out.println("The elements after sorting are:");
        print(arr);
        sc.close();;
    }
}
