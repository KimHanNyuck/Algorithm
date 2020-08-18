
public class Level3_02 {
	public int[][] solution(int n) {
        int[][] answer = {};
        int least = 1 ;
        int room = 0;
        for(int i = n ; i > 0 ; i --) {
        	least *= 2;
        }
        least--;
        answer = new int[least][2];
        answer = hanoiTower(1, 2, 3, answer, n, room);
        return answer;
    }
	public int[][] hanoiTower(int first, int second, int third, int[][] answer, int n, int room) {
		if(n==1) {
			answer[room][0] = 1;
			answer[room][1] = 3;
			return answer;
		} else {
			answer[room][0]= first;
			answer[room][1]= third;
			hanoiTower(1, 2, 3, answer, n-1, room++);
			hanoiTower(2, 1, 3, answer, n-1, room++);
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
