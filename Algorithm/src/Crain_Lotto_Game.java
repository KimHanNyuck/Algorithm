import java.util.Stack;

public class Crain_Lotto_Game {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<Integer>();
        for(int i = 0 ; i < moves.length ; i ++) {
        	int delete = moves[i] -1;	// ������ ��ġ
        	for(int j = 0 ; j < board.length; j ++) {
        			if(board[j][delete]!=0) {	// 0�� �ƴҰ�� Ž��
        				if(bucket.isEmpty()) {	// ������ �� ���
        					bucket.add(board[j][delete]);
            				board[j][delete] = 0;
            				break;
        				} else {	// ������ ���� �������
        					if(board[j][delete]==bucket.peek()) {	// ������ �����°��
        						bucket.pop();
                				board[j][delete] = 0;
                				answer+=2;
                				break;
        					} else {	// ������ ������ �ʴ� ���
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
