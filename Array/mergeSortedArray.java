import java.io.*;
import java.util.* ;

public class mergeSortedArray {
   public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=m-1 , j=n-1 ;
        while(i>=0 && j>=0 ){
            if(nums1[i]>=nums2[j])
            {
                nums1[i+j+1]=nums1[i] ;
                i-- ;
                
            }else
                {
                    nums1[i+j+1]=nums2[j];
                    j-- ;
                }
        }
        while(j>=0){
                    nums1[j]=nums2[j];
                    j-- ;
                }
       
    }
   public static void main(String[] args) {
        int[] arr1 = {1, 4, 8};
        int[] arr2 = {2, 3, 9};
        int n = 3, m = 3;
       merge(arr1,n, arr2, m);
        System.out.println("The merged arrays are:");
        
        for (int i = 0; i <= n+m-2; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

}