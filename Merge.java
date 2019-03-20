public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    int[] temp = new int[data.length];
    for (int i = 0; i < data.length; i ++){
      temp[i] = data[i];
    }
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
  private static void merge(int[] data, int[] temp, int lo , int middle, int hi){
    int low = lo;
  	int mid = middle + 1;
  	for (int i = lo; i <= hi; i++) {
  		if (low <= middle && mid <= hi) {
  			if (data[low] < data[mid]){
  				temp[i] = data[low++];
        }
				else{
  				temp[i] = data[mid++];
        }
  		}
  		else {
  			if (low > middle){
  				temp[i] = data[mid++];
        }
  			else{
  				temp[i] = data[low++];
        }
  		}
  	}
  }
}
