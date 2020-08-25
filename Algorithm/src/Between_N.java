import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Between_N {
	 public long[] solution(int x, int n) {
	      long[] answer = new long[n];
	      long temp = x;              
	      for(int i = 0; i < n; i++){
	          answer[i] = temp * (i+1);
	      }            
	      return answer;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Between_N bn = new Between_N();
		
		System.out.println(bn.solution(-4, 2));
	}

}
