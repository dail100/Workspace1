// 1.WAP to find the duplicates present in an array.
/*
package com.company;

public class ArrayAss2Ineu {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};

        for (int i = 0; i< arr.length; i++)
        {
            for (int j = i + 1; j< arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.println(arr[j]);
                }

            }
        }
    }
}

//WAP to sort an array using Quick Sort Algorithm.

package com.company;

public class ArrayAss2Ineu {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60,70,80,90};
        for (int i= 0; i< arr.length; i++)
        {
            for (int j=1; j< arr.length-i; j++)
            {
                if (arr[j]< arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
        for (int varr:arr)
        {
            System.out.print(varr + " ");
        }
    }
}



// WAP to sort an array using Bubble Sort Algorithm.

package com.company;
import  java.util.Scanner;

public class ArrayAss2Ineu {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60,70,80,90};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the key");
        int key= sc.nextInt();
        int low=0;
        int high= arr.length-1;
        while (low<=high)
        {
            int mid= (low+high)/2;
            if (key==arr[mid])
            {
                System.out.println("Key "+key+ " found at index "+mid);
                break;
            }
            else if (key<arr[mid])
            {
                high= mid-1;
            }
            else if (key>arr[mid])
            {
                low= mid+1;
            }
        }
        if (low>high)
        {
            System.out.println("Key not found");
        }

    }
}




//  WAP to sort an array using Merge Sort Algorithm.

package com.company;
import  java.util.Scanner;
import java.util.Arrays;
class MergeSort
{
    void merge(int nums[], int left, int m, int right)
    {
        int n1 = m - left + 1;
        int n2 = right - m;

        int Left_part_arra[] = new int [n1];
        int Right_part_arra[] = new int [n2];

        for (int i=0; i<n1; ++i)
            Left_part_arra[i] = nums[left + i];
        for (int j=0; j<n2; ++j)
            Right_part_arra[j] = nums[m + 1+ j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2)
        {
            if (Left_part_arra[i] <= Right_part_arra[j])
            {
                nums[k] = Left_part_arra[i];
                i++;
            }
            else
            {
                nums[k] = Right_part_arra[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            nums[k] = Left_part_arra[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            nums[k] = Right_part_arra[j];
            j++;
            k++;
        }
    }

    // merge()
    void sort(int nums[], int left, int right)
    {
        if (left < right)
        {
            // Find the middle point
            int m = (left+right)/2;

            // Sort first halve
            sort(nums, left, m);
            // Sort second halve
            sort(nums , m+1, right);

            // Merge the sorted halves
            merge(nums, left, m, right);
        }
    }
            // Method to test above
            public static void main(String args[])
            {
                MergeSort ob = new MergeSort();
                int nums[] = {7, -5, 3, 2, 1, 0, 45};
                System.out.println("Original Array:");
                System.out.println(Arrays.toString(nums));
                ob.sort(nums, 0, nums.length-1);
                System.out.println("Sorted Array:");
                System.out.println(Arrays.toString(nums));
            }

        }



// 5.WAP to sort an array using Selection Sort Algorithm.

package com.company;
public class Selection
{
    void selection(int a[]) // function to sort an array with selection sort
    {
        int i, j, small;
        int n = a.length;
        for (i = 0; i < n-1; i++)
        {
            small = i; //minimum element in unsorted array

            for (j = i+1; j < n; j++)
                if (a[j] < a[small])
                    small = j;
// Swap the minimum element with the first element
            int temp = a[small];
            a[small] = a[i];
            a[i] = temp;
        }

    }
    void printArr(int a[]) // function to print the array
    {
        int i;
        int n = a.length;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        int a[] = { 91, 49, 4, 19, 10, 21 };
        Selection i1 = new Selection();
        System.out.println("\nBefore sorting array elements are - ");
        i1.printArr(a);
        i1.selection(a);
        System.out.println("\nAfter sorting array elements are - ");
        i1.printArr(a);
        System.out.println();
    }

}




// WAP to check whether an array is a subset of another array

package com.company;
import java.util.*;

class Subset
{
    static boolean subset_arrays(int arr1[], int arr2[],
                                 int m, int n)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
            {
                if(arr2[i] == arr1[j])
                    break;
            }

            if (j == m)
                return false;
        }

        return true;
    }

    public static void main (String[] args)
    {
        int m,n,i;
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1 :");
        m = sc.nextInt();
        System.out.print("Enter the size of array 2 :");
        n = sc.nextInt();
        System.out.print("Input the array 1 elements : ");
        for(i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Input the array 2 elements : ");
        for(i=0;i<m;i++)
        {
            arr2[i] = sc.nextInt();
        }

        if(subset_arrays(arr1,arr2,n,m))
            System.out.print("\nArray 2 is a subset of array 1\n");
        else
            System.out.print("\nArray 2 is not a subset of array 1\n");
    }
}

 */






