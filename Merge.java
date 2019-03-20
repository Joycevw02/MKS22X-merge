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

  private static void mergesort(int[] data, int[] temp, int lo, int hi){
    if (lo >= hi){
      return;
    }
    mergesort(temp, data, lo, ((lo + hi) / 2));
    mergesort(temp, data, (((lo + hi) / 2) + 1), hi);
    merge(data, lo, hi);
  }
  private static void merge(int[] data, int low , int high){
    
  }
}
