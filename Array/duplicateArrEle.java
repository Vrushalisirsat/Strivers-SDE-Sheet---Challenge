import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class duplicateArrEle{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr)
        {
            if(set.contains(num))
            {
                return num;
            }
            else{
                   set.add(num);
            }
        }
        return -1;


    }
    public static void main(String args[]) {
        int n = 6;
         ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        
        
        System.out.println(findDuplicate(arr,n));

    }
}
