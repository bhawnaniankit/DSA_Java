import java.util.Arrays;

class Main {
  public static void rev(int i, int arr[], int n) {
    // base conditionn
    if (i > n / 2)
      return;

    // swap
    int t = arr[i];
    arr[i] = arr[n - i - 1];
    arr[n - 1 - i] = t;

    // recursion
    rev(i + 1, arr, n);

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };

    System.out.println(Arrays.toString(arr));
    rev(0, arr, arr.length);
    System.out.println(Arrays.toString(arr));
  }
}
