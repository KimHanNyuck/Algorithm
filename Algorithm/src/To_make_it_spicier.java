
import java.util.PriorityQueue;

public class To_make_it_spicier {
	public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> least = new PriorityQueue<Integer>();
        for(int i=0; i<scoville.length; i++) {
            least.offer(scoville[i]);
        }
        while(least.peek()<K) {
            try {
                int temp = least.poll() + least.poll()*2; // scoville[0]+ scoville[1]*2 뺀 값 계산
                least.offer(temp); // 값 추가
                answer++; // 횟수 증가
                if(least.peek()>=K) {
                    break;
                }
                if(least.size()==1 && least.peek()<K) {
                    answer=-1;
                    break;
                }
            } catch (Exception e) { // error 일 경우 -1반환
                answer = -1;
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
