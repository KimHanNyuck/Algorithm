import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        Arrays.stream(priorities).forEach(i -> q.add(i));
        while(!q.isEmpty()) {
        	int max = q.stream().reduce(0, Integer::max).intValue();
        	
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
