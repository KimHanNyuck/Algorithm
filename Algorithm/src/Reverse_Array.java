import java.util.*;
public class Reverse_Array {
	public int[] solution(long n) { 
        return Arrays.stream(new StringBuilder(String.valueOf(n))
        		.reverse().toString().split(""))
        		.mapToInt(i->Integer.parseInt(i)).toArray();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
