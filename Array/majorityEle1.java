import java.io.*;
import java.util.* ;

public class majorityEle1 {
	public static int findMajority(int[] v, int n) {
		// Write your code here.
	    int count=0;
		int ele=0;
		for(int i=0;i<n;i++)
		{
			if(count == 0)
			{
				count=1;
				ele=v[i];
			}
			else if(v[i] == ele)
			{
				count++;
			}
			else{
				count--;
			}
		}
		int count1=0;
		for(int i=0;i<n;i++)
		{
			if(v[i] == ele)
			count1++;
		}
		if(count1 > (n/2))
		{
			return ele;
		}
		
	
	return -1;
	}

      public static void main(String[] args) {
        int[] arr = {2,5,1,5,5,3};
       
    
        System.out.print(findMajority(arr,6));
      
    }
}