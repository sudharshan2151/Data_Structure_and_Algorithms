
import java.util.Scanner;
class Main {
    
    public static void main(String[] args){
        Scanner br = new Scanner(System.in);
        int r = br.nextInt();
        int c = br.nextInt();
        char[][] ar = new char[r][c];
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j< c ; j++){
                ar[i][j]=br.next().charAt(0);
            }
        }
        String word = br.next();
        System.out.println(exist(ar,word)?"YES":"NO");
        
    }
    public static  boolean exist(char[][] board, String word) {
        for(int i = 0 ; i < board.length ; i++ ){

            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j]==word.charAt(0)&&check(board,i,j ,word,"")){
                    return true;
                }
            }
        }
        return false;
        
    }

    static boolean check(char[][] board,int i,int j,String word,String sum){
        if(word.equals(sum)){
            return true;
        }

        if(i<0 || i==board.length || j<0 || j==board[0].length || sum.length()==word.length() ||board[i][j]=='-'){
            return false;
        }
        char temp = board[i][j];
        sum+=temp;
        board[i][j]='-';
        boolean k =  check(board,i+1,j,word,sum) || check(board,i-1,j,word,sum) || check(board,i,j+1,word,sum) || check(board,i,j-1,word,sum);
        board[i][j]=temp;
        return k ; 
    }
}