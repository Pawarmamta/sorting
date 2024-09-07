import java.util.Arrays;

class Selection{
    public static void main(String[] args) {
        int arr[] = {10,-1,2,6,3,7,1,9};
          selectionsort(arr);
          System.out.println(Arrays.toString(arr));

    }
    public static void selectionsort(int []arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int last = arr.length-i-1;
            int maxindex = getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    public static int  getmaxindex(int []arr,int start,int end){
        int max=start;
      for(int i=start; i<= end; i++)
      {
          if(arr[max]<arr[i])
          {
            max = i;
          }
      }
      return max;

    }
    public static void  swap(int [] arr,int maxindex, int last){
        int temp = arr[last];
        arr[last] = arr[maxindex];
        arr[maxindex] = temp;
    }

}