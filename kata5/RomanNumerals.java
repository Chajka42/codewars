public class RomanNumerals {
 
  public static String toRoman(int n) {
    String s = "";
    while (n >= 1000) {s += "M"; n -= 1000;}
    while (n >= 900) {s += "CM"; n -= 900;}
    while (n >= 500) {s += "D"; n -= 500;}
    while (n >= 400) {s += "CD"; n -= 400;}
    while (n >= 100) {s += "C"; n -= 100;}
    while (n >= 90) {s += "XC"; n -= 90;}
    while (n >= 50) {s += "L"; n -= 50;}
    while (n >= 40) {s += "XL"; n -= 40;}
    while (n >= 10) {s += "X"; n -= 10;}
    while (n >= 9) {s += "IX"; n -= 9;}
    while (n >= 5) {s += "V"; n -= 5;}
    while (n >= 4) {s += "IV"; n -= 4;}
    while (n >= 1) {s += "I"; n -= 1;}    
    return s;
  }
  
  public static int fromRoman(String romanNumeral) {
    char[] charr = romanNumeral.toCharArray();
    int h = charr.length;
    int[] gogo = new int[h];
    int rez = 0;
    for (int j = 0; j < h; j++){
      if (charr[j] == 'I') {gogo[j] = 1;}
      if (charr[j] == 'V') {gogo[j] = 5;}
      if (charr[j] == 'X') {gogo[j] = 10;}
      if (charr[j] == 'L') {gogo[j] = 50;}
      if (charr[j] == 'C') {gogo[j] = 100;}
      if (charr[j] == 'D') {gogo[j] = 500;}
      if (charr[j] == 'M') {gogo[j] = 1000;}
      
    }
    for (int i = 0; i < h - 1; i++){
      if (gogo[i] < gogo[i+1]) {rez -= gogo[i];} else {rez += gogo[i];}
    }
    return rez + gogo[h - 1];
  }
}
