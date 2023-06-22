class search2Dmatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col = matrix[0].length;

       int low=0;
       int high=row*col-1;

       while(low <= high)
       {
           int mid = (low+high)/2;
           
           int j=mid%col;
            int i=(mid-j)/col;

           
           if(target == matrix[i][j])
           {
               return true;
           }
           if(target > matrix[i][j])
           {
             low=mid+1;
           }
           else{
               high=mid-1;
           }
       }
       return false;
    }

     public static void main(String[] args) {
        int[][] arr = {{2,5,1,3} ,{4,6,7,1}};
       int target=2;
    
        System.out.print(searchMatrix(arr,target));
      
    }

}