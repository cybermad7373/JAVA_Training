package BackTracking;
//  +-----|-----|-----|-----+
//  | (1) | (2) | (3) | (4) |   PLACE TWO(2) QUEEN IN ALL POSSIBLE ORDER
//  +_____|_____|_____|_____+


public class QCombination {
    public static void main(String[] args) {
        Combination(new boolean[4],0,0,2,"");
    }
    public static void Combination(boolean[] board, int col, int qpsf,int tq,String ans)
    {
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        if(col == board.length){
            return;
        }

        if(board[col] == false)
        {
            board[col] = true;
            Combination(board, col+1, qpsf+1, tq, ans+"B"+col+ " ");
            board[col] = false;
        }

        Combination(board, col+1, qpsf, tq, ans);
    }
}
