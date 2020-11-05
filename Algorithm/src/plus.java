import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class plus {
		public int[] solution(int[] numbers) {
	        int[] answer = {};
	        Set set = new HashSet<Integer>();
	        for(int i = 0 ; i < numbers.length - 1 ; i++) {
	        	for(int j = i+1 ; j < numbers.length; j++) {
	        		set.add(numbers[i]+numbers[j]);
	        	}
	        }
	        Stream<Integer> stream = set.stream().sorted();
	        return stream.mapToInt(i->i).toArray();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
