import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Save_Boat {
	public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        List<Integer> q = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0 ; i < people.length; i++) {
        	System.out.println(people[i]);
        	while(people[i]<limit) {
        		people[i] -= limit;
        		answer++;
        	}
        	if(q.isEmpty()) {
        		q.add(people[i]);
        		System.out.println("추가");
        	} else {
        		sum = IntStream.of(people).sum();
        		System.out.println(sum);
        		if(sum + people[i] > limit) {
        			answer ++;
        			q = new LinkedList<Integer>();
        			q.add(people[i]);
        			System.out.println("이상");
        		} else if(sum+people[i] == limit) {
        			answer++;
        			q = new LinkedList<Integer>();
        			System.out.println("보트태움");
        		} else {
        			q.add(people[i]);
        		}

        	}
        }
        System.out.println(answer);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Save_Boat sb = new Save_Boat();
		sb.solution(new int[] {70, 50, 80, 50}, 100);
	}

}
