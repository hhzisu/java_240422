package chapter03;

/*
 * 문자열에서 r 알파벳 갯수 구하기
 * 알파벳 대/소문자 상관없음
 * toCharArray() 메소드 이용
 */
public class Ex3_8 {
	public static void main(String[] args) {
		int count=0;
		String str="Prigramming is fun! Right?";
//		toCharArray() : 문자열에서 문자 하나씩 가지고 오는 메소드 (P~?)
//		charArr:배열/배열변수/참조변수/레퍼런스변수/배열객체
		char[] charArr = str.toCharArray();
		
//		Programming is fun! Right? => 문자열 크기만큼 반복
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i]=='R'||charArr[i]=='r') { //charArr[i]:배열원소(배열값)
				count++;
			}
		}
		System.out.println("=> R(r)의 갯수: "+count);
	}
}
