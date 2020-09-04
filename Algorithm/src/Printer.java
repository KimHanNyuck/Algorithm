import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
	public int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> prior = new PriorityQueue<Integer>(Collections.reverseOrder());
        Arrays.stream(priorities).forEach(i -> {prior.add(i)});
        while(!prior.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == (int)prior.peek()) {
                    if(i == location){
                        return answer;
                    }
                    prior.poll();
                    answer++;
                }
            }
        }

        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
