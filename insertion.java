import java.util.Arrays;

public class insertion {
    
    public static void main (String [] args)
    {
        int []arr = {2,5,1,100,7,3,-1,4,9};
        insertions(arr);
      System.out.println(Arrays.toString(arr));

    }
    public static void insertions( int []arr){
         for(int i=0; i<arr.length-1; i++)
         {
            for(int j=i+1; j>0; j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else{
                 break;
                }
            }
         }
    } 
    public static void swap(int []arr ,int start,int end){
       int temp =0;
       temp = arr[start];
       arr[start] = arr[end];
       arr[end] = temp;

    }
}
