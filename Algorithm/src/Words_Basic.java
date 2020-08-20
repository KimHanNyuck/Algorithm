
public class Words_Basic {
	public boolean solution(String s) {
        return (s.chars().filter(i -> (i >= 48))
        		.filter(i -> (i <= 57))
        		.toArray().length == s.length())&&
        		(s.length() == 4 || s.length() == 6) ? true : false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
