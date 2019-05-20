public class MergeSort {

  public void mergeSort (int arr[], int l, int r) {
    if (l < r) {
      int m = l+(r-l)/2;
      mergeSort(arr[],l,m);
      mergeSort(arr[],m+1,r);

      merge(arr,l,m,r);
    }
  }
  // Merges two subarrays of arr[].
  // First subarray is arr[l..m]
  // Second subarray is arr[m+1..r]
  public void merge(int arr[], int l, int m, int r) {
    // Find sizes of two subarrays to be merged
    int n1 = m-l+1;
    int n2 = r-m;

    /* Create temp arrays */
    int[] arr1 = new arr[n1];
    int[] arr2 = new arr[n2];

    /* copy data into array */
    for (int i = l; i < m+1;i++ ) {
      arr1[i] = arr[i];
    }
    for (int i = m+1; i < r+1;i++ ) {
      arr2[i] = arr[i];
    }
    // intial Index
    int i = 0;
    int j = 0;

    // initial index of merged array
    int k = l

    while (i < n1 && j < n2) {
      if (arr1[i] > arr2[j]) {
        arr[k] = arr2[j];
        j++;
      } else {
        arr[k] = arr1[i]
        i++;
      }
      k++;
    }

    while (i < n1) {
      arr[k] = arr1[i];
      i++;
      k++;
    }

    while(j < n2) {
      arr[k] = arr2[j];
      j++;
      k++;
    }
  }
}
