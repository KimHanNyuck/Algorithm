
public class Level2_01 {
	public int solution(int[] arr) {
        int answer = 0;
        for(int i = 0 ; i < arr.length-1 ; i++) {
        	if(i == 0 ) {
        		answer = (arr[i]*arr[i+1])/gcb(arr[i], arr[i+1]);
        	} else {
        		answer = (answer*arr[i+1])/gcb(answer, arr[i+1]);
        	}
        }
        return answer;
    }
	
	static int gcb(int a, int b) {
		while(b!=0) {
			int r = a%b ;
			a = b;
			b = r;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
