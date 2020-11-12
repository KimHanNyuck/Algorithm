
public class N_Tornado {
	public int solution(int n) {
        // Write code here.
		int[][] arr = new int[n][n];
        int answer = 0;
        makeArr(arr, 0, 0, 1);
        for(int i = 0 ; i < arr.length ; i++) {
        	for(int j = 0 ; j < arr.length ; j++) {
        		System.out.println(i+"/"+j+arr[i][j]);
        	}
        }
        return answer;
    }
	public int[][] makeArr(int[][] arr, int i, int j, int k){
		if(j == arr.length || j == -1 || i == arr.length || i == -1) {
			k--;
			return arr;
		}
		if(arr[i][j] == 0) {
			arr[i][j] = k;
			
			makeArr(arr, i, j++, k++);
			makeArr(arr, i++, arr.length-1, k++);
			makeArr(arr, arr.length-1, j--, k++);
			makeArr(arr, i--, 0, k++);
		}
		return arr;
	}

    // The following is main method to output testcase.
    public static void main(String[] args) {
        N_Tornado sol = new N_Tornado();
        int n1 = 3;
        int ret1 = sol.solution(n1);

        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int n2 = 2;
        int ret2 = sol.solution(n2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}
