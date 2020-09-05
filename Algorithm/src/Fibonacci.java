import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	public int solution(int n) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        for(int i = 2 ; i <= n; i++) {
        	list.add((list.get(i-2)+list.get(i-1))%1234567);
        }
        return list.get(n);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
