import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 6, 7, 8 };
    BBSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void BBSort(int[] arr) {
    boolean swaped;
    for (int i = 0; i < arr.length; i++) {
      swaped = false;
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swaped = true;
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      // if for any iterrartion of i there is no swapinng then the array is soretd!!
      if (!swaped)
        break;
    }
  }
}
