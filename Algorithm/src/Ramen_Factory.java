import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ramen_Factory {
	public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int supplyIdx = 0;
        
        for(int i = 0 ; i < k ; ++i){
            if(supplyIdx < dates.length && i == dates[supplyIdx]){
                pq.offer(supplies[supplyIdx++]);
            }
            
            stock--;
            
            if(stock == -1) {
                stock += pq.poll();
                answer++;
            }
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ramen_Factory rf = new Ramen_Factory();
		rf.solution(4, new int[] {4,10,15}, new int[] {20,5,10}, 30);
	}

}
