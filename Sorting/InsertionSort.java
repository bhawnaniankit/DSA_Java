import java.util.Arrays;

class InsertionSort {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    ISort(arr);
  }

  static void ISort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (arr[j] < arr[j - 1])
          swap(arr, j, j - 1);
        else
          break;
      }
    }

    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int s, int e) {
    int temp = arr[s];
    arr[s] = arr[e];
    arr[e] = temp;
  }

}
