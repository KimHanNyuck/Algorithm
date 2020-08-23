import java.util.Arrays;

public class Remove_Lowest {
	public int[] solution(int[] arr) {       
        return arr.length == 1 ? new int[] {-1} : Arrays.stream(arr)
        		.filter(s -> s != (int)Arrays.stream(arr).min().getAsInt()).toArray();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
