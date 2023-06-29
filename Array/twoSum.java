import java.io.*;
import java.util.*;
class twoSum {
  
    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
  int n = nums.length;
     
            for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                  ans[0]=i;
                  ans[1]=j;
                }
            }
        
        }
        return ans;
    }


      public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int s = 14;
       int ans[] = twoSum(arr, s);
        System.out.println("This is the answer for variant 1: " + ans[0] + " " + ans[1]);
    }
}
