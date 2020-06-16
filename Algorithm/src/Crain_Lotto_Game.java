import java.util.Stack;

public class Crain_Lotto_Game {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<Integer>();
        for(int i = 0 ; i < moves.length ; i ++) {
        	int delete = moves[i] -1;	// 삭제할 위치
        	for(int j = 0 ; j < board.length; j ++) {
        			if(board[j][delete]!=0) {	// 0이 아닐경우 탐색
        				if(bucket.isEmpty()) {	// 스텍이 빈 경우
        					bucket.add(board[j][delete]);
            				board[j][delete] = 0;
            				break;
        				} else {	// 스텍이 비지 않은경우
        					if(board[j][delete]==bucket.peek()) {	// 인형이 터지는경우
        						bucket.pop();
                				board[j][delete] = 0;
                				answer+=2;
                				break;
        					} else {	// 인형이 터지지 않는 경우
        						bucket.add(board[j][delete]);
                				board[j][delete] = 0;
                				break;
        					}
        				}
        			} 
        	}
        }
        return answer;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crain_Lotto_Game clg = new Crain_Lotto_Game();
		clg.solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[] {1,5,3,5,1,2,1,4});

	}

}
