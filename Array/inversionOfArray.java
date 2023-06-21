// import java.util.* ;
// import java.io.*; 
// public class Solution {
//     public static long getInversions(long arr[], int n) {
//         // Write your code here.
//     }
// }


class inversionOfArray
{
    static long Merge(long arr[] , int low,int mid,int high)
    {
        long temp[] = new long[arr.length];  // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr
        int k=low;
        long count=0;
        
        while(left <= mid && right <= high)
        {
            if(arr[left] <= arr[right])
            {
                temp[k] = arr[left];
                left++;
            }
            else  //right is smaller
            {
                temp[k] = arr[right];
                count += (mid - left + 1);
                right++;
            }
            k++;
        }
        
        while (left <= mid) {
            temp[k] = arr[left];
            k++;
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp[k] = arr[right];
            k++;
            right++;
        }
         
        for (int p = low; p <= high; p++)
        {
            arr[p] = temp[p];
        }
        return count;
    }
    
    static long MergeSort(long arr[] , int low,int high)
    {
        long count=0;
        
        if(low < high)
        {
            int mid=(low+high)/2;
            
        count += MergeSort(arr,low,mid);
        count += MergeSort(arr,mid+1,high);
        count += Merge(arr,low,mid,high);
        }
        return count;
        
    }
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long getInversions(long arr[], int n)
    {
        // Your Code Here
        return MergeSort(arr,0,arr.length-1);
        
        
    }

      public static void main(String[] args) {
        long[] arr = {2,5,1,3,4};
       
        System.out.print("The inversion of array are: \n");
       System.out.println(getInversions(arr,arr.length));
    }


}