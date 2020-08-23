import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ReverseOrder {
	public long solution(long n){  
        return Long.parseLong(Arrays.stream(String.valueOf(n).split(""))
        		.sorted(Comparator.reverseOrder()).reduce((a,b) -> a+b)
        		.toString().substring(9, 9+String.valueOf(n).length()));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseOrder ro = new ReverseOrder();
		System.out.println(ro.solution(118372));
	}

}
