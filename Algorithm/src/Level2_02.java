import java.util.*;
public class Level2_02 {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		boolean is = true;
		while(is){
			Arrays.sort(scoville);
			if(scoville[0]<K) {
				scoville[0] = scoville[0]+(scoville[1]*2);
				scoville[1] = scoville[0]+(scoville[1]*2);
				answer++;
			} else {
				is = false;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
