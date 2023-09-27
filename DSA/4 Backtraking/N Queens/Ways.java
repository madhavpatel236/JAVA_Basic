
public class Ways {

    public static void possibleWays(char [][]board , int row){
        // base condition
        if(row == board.length){
            print(board);
            return; 
        }

        // recursive call
        for(int j = 0 ; j<board.length ;j++){ // for column
            board[row][j] ='Q';
            possibleWays(board, row+1); // recursion
            board[row][j] = '.'; // Backtraking
        }
    }

    public static void print (char [][]board){
        System.out.println("--------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+ " ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int n =2;
        char board[][] = new char[n][n];
        
        //initialize the board 
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        // function calling
        possibleWays(board , 0);
    }
}
