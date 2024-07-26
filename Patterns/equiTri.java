package Patterns;

public class equiTri {
  public static void main(String[] args) {
    int n = 9;
    for (int i = 0; i < n; i++) {
      // spaces
      for (int j = 0; j < n - 1 - i; j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 0; j < (2 * i) + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
