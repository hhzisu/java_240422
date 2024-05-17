package chapter06;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);

		sb.append(" is pencil"); //append(): 문자열을 연결 (추가되면서 수정됨)
		System.out.println(sb); //This is pencil
		
		sb.insert(7, " my"); //insert(): 문자열 삽입 //is 다음에 my 삽입
		System.out.println(sb); //This is my pencil
		
		sb.replace(8, 10, "your"); //replace(): 문자열 대체 //my가 your로
		System.out.println(sb); //This is your pencil
		
		sb.delete(8, 13); //delete(): 문자열 삭제 //your 삭제
		System.out.println(sb); //This is pencil
		
		sb.setLength(4); //setlength(): 문자열 길이 수정
		System.out.println(sb); //This
	}
}
