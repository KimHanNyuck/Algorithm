import java.util.Arrays;

public class No_K {

	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0 ; i <= commands.length-1; i++) {
        	 int x = commands[i][0];	// ù ��
        	 int y = commands[i][1];	// �ι�° ��
        	 int z = commands[i][2];	// ���� �� ���� ������ ����
        	 int solution = 0;
    		 int[] subarray = new int[y-x+1];	// �迭�� ���� ����
        	 for(int j = 0 ; j <= array.length-1 ; j++) {	//  x~y������ �� subarray ����
        		 if(j >= x-1 && j <= y-1) {	
        			 subarray[solution] = array[j];
        			 solution++;	// ���� ���� ����
        		 }
        	 }
        	 Arrays.sort(subarray);		// ����
        	 answer[i] = subarray[z-1];		// n��° ����
        	 
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
