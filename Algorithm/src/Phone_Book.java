
public class Phone_Book {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        int i = 0 ;
        int j = 1 ;
        answer = tf(phone_book, i, j, answer);
        return answer;
    }
	private boolean tf(String[] phone_book, int i, int j, boolean answer) {
		if(answer == false) {
			return answer;
		}
		if(phone_book[i].length() > phone_book[j].length()) {
			String temp = phone_book[i];
			phone_book[i] = phone_book[j];
			phone_book[j] = temp;
		}
		if(phone_book[j].contains(phone_book[i])==true) {
			answer = false;
			return answer;
		} else {
			if(j != phone_book.length-1) {
				j++;
				tf(phone_book, i , j, answer);
			} else if(j == phone_book.length-1) {
				i++;
				j = i+1;
				if(i == phone_book.length-1 && answer != false) {
					answer = true;
					return answer;
				} else {
					tf(phone_book, i , j, answer);
				}
				
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone_Book pb = new Phone_Book();
		pb.solution(new String[] {"119", "97674223", "1195524421"});

	}

}
