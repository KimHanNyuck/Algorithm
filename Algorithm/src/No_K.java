import java.util.Arrays;

public class No_K {

	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0 ; i <= commands.length-1; i++) {
        	 int x = commands[i][0];	// 첫 수
        	 int y = commands[i][1];	// 두번째 수
        	 int z = commands[i][2];	// 정렬 후 받을 숫자의 순서
        	 int solution = 0;
    		 int[] subarray = new int[y-x+1];	// 배열의 공간 생성
        	 for(int j = 0 ; j <= array.length-1 ; j++) {	//  x~y까지의 수 subarray 담음
        		 if(j >= x-1 && j <= y-1) {	
        			 subarray[solution] = array[j];
        			 solution++;	// 방의 숫자 증가
        		 }
        	 }
        	 Arrays.sort(subarray);		// 정렬
        	 answer[i] = subarray[z-1];		// n번째 숫자
        	 
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
