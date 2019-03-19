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
    //If low is greater than or equal to high, terminate the function
    if (low >= high){
      return;
    }
    //Left is always the first half of data
    left = new int[data.length / 2];
    //If the data has an even amount of integers, then right is equal to left
    if (data.length % 2 == 0){
      right = left;
    }
    //If there is an odd amount, then the right one will be one more than the left
    else{
      right = new int[left.length + 1];
    }

    //Setting the values in left and right
    for (int i = 0; i < left.length; i ++){
      left[i] = data[i];
    }
    for (int i = 0; i < right.length; i ++){
      right[i] = data[left.length - 1 + i];
    }

    //Merge left and right
    merge(left, 0, left.length - 1);
    merge(right, 0, right.length - 1);

    //Keeps track of left and right indexes
    int li = 0;
    int ri = 0;

    //Loop through data...
    for (int i = 0; i < data.length; i ++){
      //If both the indexes are in bound...
      if (li < left.length && ri < right.length){
        //...then pick the smaller value to go first in the data
        if (left[li] < right[ri]){
          data[i] = left[li];
          li ++;
        }
        else{
          data[i] = right[ri];
          ri ++;
        }
      }
      //If the left is out of bounds but the right is not, then set data[i] to
      //the value of right
      else if (li >= left.length && ri < right.length){
        data[i] = right[ri];
        ri ++;
      }
      //If the right is out of bounds but the  left is not, then set data[i] to
      //the value of left
      else if (li < left.length && ri >= right.length){
        data[i] = left[li];
        li ++;
      }
    }
  }
}
