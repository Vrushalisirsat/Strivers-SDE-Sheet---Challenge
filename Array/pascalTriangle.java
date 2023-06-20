import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class pascalTriangle {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				 ArrayList<ArrayList<Long>> ans = new ArrayList<>();
                long one =1;
				 for(int i=0;i<n;i++)
				 {
					 ArrayList<Long> row = new ArrayList<Long>();
					 row.add(one);

					 for(int j=1;j<i;j++)
					 {
						 row.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
					 }

					 if(i > 0)
					 row.add(one);
					 ans.add(row);

				 }

				 return ans;
        }
	

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        int n = 5;
      
       ArrayList<ArrayList<Long>> ans = printPascal(n);
        for (ArrayList<Long> it : ans) {
            for (Long ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}