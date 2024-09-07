public class Bubble {
    public static void main(String[] arg)
    {
       int arr [] = {3,1,5,4,2};
       int n = arr.length;
       for(int i=0; i<n; i++)
       {
          for(int j=1; j<n-i; j++)
          {
             if(arr[j]<arr[j-1])
             {
             int temp = arr[j];
             arr[j] = arr[j-1];
             arr[j-1] = temp;
             }
      
           }
       }
       for(int i=0; i<n; i++)
       {
        System.out.println(arr[i]);
       }
    }
}