
public class Strange_Alphabet {
	public String solution(String s) {
        String[] ans = s.toLowerCase().split(" ",-1);
        String answer = "";
        for(int i = 0 ; i < ans.length; i ++) {
        	ans[i] = ans[i].toLowerCase();
        	for(int j = 0 ; j < ans[i].length() ; j ++) {
        		 if( j % 2 == 0) {
        			 answer += (char)(ans[i].charAt(j)-32); 
        		 } else {
        			 answer += (char)(ans[i].charAt(j));
        		 }
        	}
        	if(i != ans.length-1) answer += " ";
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strange_Alphabet sa = new Strange_Alphabet();
		
		System.out.println(sa.solution("A"));
	}

}
