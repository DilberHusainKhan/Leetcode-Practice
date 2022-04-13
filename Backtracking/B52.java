import java.util.Scanner;

public class B52 {
        public static int totalNQueens(int n)
         {
            boolean[][] board= new boolean[n][n];
            return count(board,0);
         }
         public static int count(boolean[][] board,int row)
         {
             if(row==board.length)
             {
                 return 1;
             }
             int c=0;
             for(int col=0;col<board.length;col++)
             {
                 if(isSafe(board,row,col))
                 {
                     board[row][col]=true;
                     c+=count(board,row+1);
                     board[row][col]=false;
                 }
             }
             return c;
         }
         public static boolean isSafe(boolean[][] board,int row,int col)
         {
             for (int i = 0; i < row; i++) {
                 if(board[i][col])
                     return false;
             }
             for(int i=1;i<=Math.min(row,col);i++)
             {
                 if(board[row-i][col-i])
                     return false;
             }
             for (int i = 1; i <=Math.min(row,board.length-1-col); i++) {
                 if(board[row-i][col+i])
                     return false;
             }
             return true;
         }
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             int no = totalNQueens(n);
             System.out.println("Number of ways queens place "+no);
         }     
}
