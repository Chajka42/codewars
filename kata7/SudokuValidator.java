public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
      
for(int i = 0; i < 9; i++){
for(int j = 0; j < 8; j++){
for(int l = j + 1; l < 9; l++){
   if(sudoku[i][j] == sudoku[i][l] | sudoku[i][j] == 0){return false;}}}}
     
for(int j = 0; j < 9; j++){
for(int i = 0; i < 8; i++){
for(int k = i + 1; k < 9; k++){
   if(sudoku[i][j] == sudoku[k][j]){return false;}}}}
     
for(int i = 0; i < 9; i += 3){
for(int j = 0; j < 9; j += 3){
for(int m = 0; m < 8; m++){
for(int n = m + 1; n < 9; n++){
   if(sudoku[i + m%3][j + m/3] == sudoku[i + n%3][j + n/3]){return false;}}}}}

 return true;
    }
}
