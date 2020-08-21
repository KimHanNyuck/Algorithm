
public class Password {
	public String solution(String s, int n) {
		  String answer = "";
		  for(int i= 0 ; i < s.length() ; i++) {
			  if((int)s.charAt(i)==32) {
				  answer += " ";
				  continue;
			  }
			  if(s.charAt(i)<=90 && s.charAt(i)>=65) {
				  if((int)(s.charAt(i)+n)>90) {
					  int j = 0 ; 
					  j = (int)((s.charAt(i)+n-1)-90);
					  answer += (char)(65+j);
				  } else {
				  answer += (char)(s.charAt(i)+n);
				  }
			  }
			  if((int)s.charAt(i)<=122 && (int)s.charAt(i)>=97) {
				  if((int)(s.charAt(i)+n)>122) {
					  int j = 0 ; 
					  j = (int)((s.charAt(i)+n-1)-122);
					  answer += (char)(97+j);
				  } else {
				  answer += (char)(s.charAt(i)+n);
				  }
			  }
		  }     
	      return answer;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
