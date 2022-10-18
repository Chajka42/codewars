// Make sure your class is public
 public class Kata {
    public static double findUniq(double arr[]) {
      double x = arr[0], y = arr[arr.length - 1], z = arr[1];
      if (x == y){for (int i = 0; i < arr.length; i++){if (x != arr[i]){return arr[i];}}
    } else {if (x == z){return y;}}
      return x;
} 
   }
