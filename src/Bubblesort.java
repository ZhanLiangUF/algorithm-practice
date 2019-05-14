public class Bubblesort {
  // 5 1 4 2 8
  // swap one element at a time
  public static void bubblesort(int arr[]) {
    int l = arr.length;
    for (int i = 0; i < l;i++) {
      for (int j = 0;j < l-i-1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }

    }
  }
}
