import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Function_Develop {
	public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> s = new LinkedList<Integer>();
        Arrays.stream(speeds).forEach(i -> s.add(i));
        Arrays.stream(progresses).forEach(i -> q.add(i) );
        List<Integer> list = new ArrayList<Integer>();
    	int length = q.size();
    	int dif = q.size();
        while(!q.isEmpty()) {
        	for(Integer i : s) {
        		int j = q.poll();
        		j += i;
        		q.add(j);
        	}
        	try {
        	while(q.peek() >= 100) {
        		q.remove();
        		s.remove();
        	}
        	}catch(Exception e) {
        		
        	}
        	dif = q.size();
        	if(length != dif) {
        		list.add(length-dif);
        		System.out.println(length-dif);
        		length = dif;
        	}
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function_Develop fd = new Function_Develop();
		fd.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[] {1, 1, 1, 1, 1, 1});
	}

}
