public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    //Creates the temporaty array
    int[] temp = new int[data.length];
    for (int i = 0; i < data.length; i ++){
      temp[i] = data[i];
    }
    mergesort(temp, data, 0, data.length - 1);
  }

  //Basic outline from website :P
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
    //Stores the indexes of the things to be swapped
    int low = lo;
  	int mid = middle + 1;
    //Modifying the values in data
  	for (int i = lo; i <= hi; i++) {
      //If the indexes are in bound...
  		if (low <= middle && mid <= hi) {
        //Find the lowest value and make the value at temp that value and increase
        //the index of either low or mid
  			if (data[low] < data[mid]){
  				temp[i] = data[low++];
        }
				else{
  				temp[i] = data[mid++];
        }
  		}
      //If the indexes are out of bound...
  		else {
        //Find the lesser value and make the value at temp that value and increase
        //the index of either low or mid
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
