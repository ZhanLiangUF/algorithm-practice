public class Lis {

  static int max_ref; // stores the LIS
  
  public static int _lis(int arr[], int n) {
      // base case
      if (n == 1)
          return 1;

      // 'max_ending_here' is length of LIS ending with arr[n-1]
      int res, max_ending_here = 1;

       /* Recursively get all LIS ending with arr[0], arr[1] ...
          arr[n-2]. If   arr[i-1] is smaller than arr[n-1], and
          max ending with arr[n-1] needs to be updated, then
          update it */
       for (int i = 1; i < n; i++)  {
         res = _lis(arr,i);
         if (arr[i-1] < arr[i] && res + 1 > max_ending_here) {
           max_ending_here = res + 1;
         }
       }

       // compare max_ending_here with other function calls with their own max_ending_here
       if (max_ending_here > max_ref) {
         max_ref = max_ending_here;
       }

       return max_ending_here;
    }

    public static int lis(int arr[], int n)
  {
      // The max variable holds the result
       max_ref = 1;

      // The function _lis() stores its result in max
      _lis( arr, n);

      // returns max
      return max_ref;
  }

}
