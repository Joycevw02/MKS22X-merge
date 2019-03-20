public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    int[] temp = data;
    mergesort(temp, data, 0, data.length - 1);
  }

  private static void mergesort(int[] data, int[] temp, int lo, int hi){
    if (lo >= hi){
      return;
    }
    int middle = (lo + hi) / 2;
    mergesort(temp, data, lo, middle);
    mergesort(temp, data, middle + 1, hi);
    merge(data, temp, lo, middle, hi);
  }
  private static void merge(int[] data, int[] temp, int lo , int mid, int hi){
    int low = lo;
    int middle = mid + 1;
    for (int i = lo; i <= hi; i ++){
      if (low <= mid && middle <= hi){
        if (data[lo] <= data[middle]){
          temp[i] = data[low];
          low ++;
        }
        else {
          temp[i] = data[middle];
          middle ++;
        }
      }
      else {
        if (low > mid){
          temp[i] = data[middle];
          middle ++;
        }
        else{
          temp[i] = data[low];
          low ++;
        }
      }
    }
  }
}
