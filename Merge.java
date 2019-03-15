public class Merge{
  private static int[] left;
  private static int[] right;
  private static int[] temp;
  private static boolean leftsort = false;
  private static boolean rightsort = false;
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    merge(data, 0, data.length - 1);
  }

  private static void merge(int[] data, int low , int high){
    if (low >= high){
      return;
    }
  }

  private static int help(int[] data, int low, int high){
    if (low == high){
      return low;
    }
    int middle = (data.length / 2) - 1;
    if (data.length % 2 == 0){
      left = new int[data.length / 2];
      right = left;
    }
    else{
      left = new int[middle];
      right = new int[middle + 1];
    }
    temp = new int[data.length];
    if (leftsort && rightsort){
      for (int i = 0; i < temp.length; i ++){
        
      }
    }
    return middle;
  }
}
