package sec01_exam;

public class StringEx {

	public static void main(String[] args) {
		
		//name, str의  String클래스 타입을 지내고 있다.
		//name, str은 참조형 변수이다.
		String name = new String("ja" + "va");
		String str = new String(name + 8.0);
		
		//any type + 문자열(String) = 문자열(String)
		// +는 각각의 문자열을 이어주는 역할
		System.out.println(name.toString());
		System.out.println(str.toString());
		
		System.out.println(123456789);
		
	}

}
