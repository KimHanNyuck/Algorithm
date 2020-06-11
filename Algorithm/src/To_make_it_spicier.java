
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
                int temp = least.poll() + least.poll()*2; // scoville[0]+ scoville[1]*2 �� �� ���
                least.offer(temp); // �� �߰�
                answer++; // Ƚ�� ����
                if(least.peek()>=K) {
                    break;
                }
                if(least.size()==1 && least.peek()<K) {
                    answer=-1;
                    break;
                }
            } catch (Exception e) { // error �� ��� -1��ȯ
                answer = -1;
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
