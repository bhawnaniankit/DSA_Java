package Patterns;

public class binTri {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      int d = i % 2;
      d = d == 1 ? 0 : 1;
      for (int j = 0; j <= i; j++, d = d == 1 ? 0 : 1) {
        System.out.print(d);
      }
      System.out.println();
    }
  }
}
