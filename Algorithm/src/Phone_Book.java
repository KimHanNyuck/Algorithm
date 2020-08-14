
public class Phone_Book {
	public boolean solution(String[] phone_book) {
        boolean answer = false;
        int i = 0 ;
        int j = 1 ;
        answer = tf(phone_book, i, j);
        return answer;
    }
	private boolean tf(String[] phone_book, int i, int j) {
		if(phone_book[i].length() > phone_book[j].length()) {
			String temp = phone_book[i];
			phone_book[i] = phone_book[j];
			phone_book[j] = temp;
		}
		if(phone_book[j].contains(phone_book[i])==true) {
			return true;
		} else {
			if(j != phone_book.length-1) {
				j++;
				tf(phone_book, i , j);
			} else {
				i++;
				j = i+1;
				tf(phone_book, i , j);
				if(i == phone_book.length-1) {
					return false;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
