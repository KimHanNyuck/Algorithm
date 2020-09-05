import java.util.Arrays;

public class H_Index {
	public int solution(int[] citations) {
		Arrays.sort(citations);
		for(int i = 0 ; i < citations.length ; i ++) {
			int number = citations.length - i;
			if(citations[i] >= number) {
				return number;
			}
		}
        return 0;
    }
	public static void main(String[] args) {
		H_Index h = new H_Index();
		h.solution(new int[] {3, 0, 6, 1, 5});
	}

}
