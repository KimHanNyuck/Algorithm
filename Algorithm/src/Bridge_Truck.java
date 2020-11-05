import java.util.LinkedList;
import java.util.Queue;

public class Bridge_Truck {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int totalWeight = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int k : truck_weights) {
        	while(true) {
        		if(queue.isEmpty()) {
        			queue.add(k);
        			totalWeight += k;
        			answer++;
        			break;
        		} else if(queue.size() == bridge_length) {
        			totalWeight -= queue.poll();
        		} else {
        			if(totalWeight+k > weight) {
        				answer ++;
        				queue.add(0);
        			} else {
        				queue.add(k);
        				totalWeight += k;
        				answer++;
        				break;
        			}
        		}
        	}
        }
        
        return answer+ bridge_length;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
