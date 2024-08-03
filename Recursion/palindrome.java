class palindromeStr {

  static boolean palindrome(int i, String str, int n) {
    if (i > n / 2)
      return true;

    if (str.charAt(i) != str.charAt(n - i - 1))
      return false;

    return palindrome(i + 1, str, n);

  }

  public static void main(String[] args) {
    String str = "AnknA";

    System.out.println(str);

    System.out.println(palindrome(0, str, str.length()));
  }
}
