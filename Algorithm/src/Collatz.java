import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collatz {
	public int solution(int num) {
        int answer = 0;
        long number = num;
        while(number!=1) {
        	if(number%2==0) {
        		number/=2;
        	}else {
        		number= number*3+1;
        	}
        	answer++;
        	if(answer>=500) { return -1;}
        }   
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
