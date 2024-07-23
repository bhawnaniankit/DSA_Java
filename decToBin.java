import java.util.Scanner;

class DecToBin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long bin = n % 2;
    n /= 2; // n=n/2;

    while (n > 0) {
      bin = (bin * 10) + n % 2;
      n /= 2;
    }
    sc.close();
    System.out.println(bin);
  }
}
