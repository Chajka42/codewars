public class Kata {
  public static int[] digitize(long n) {
    long s = (int) String.valueOf(n).length();
    int[] k = new int[(int) s];
    System.out.println(n + " ");
    for (byte i = 0; i < s; i++) {
      k[i] = (int) Math.abs(n % 10);
      n /= 10;
      System.out.println(k[i] + " - ");
    }
    return k;
  }

}
