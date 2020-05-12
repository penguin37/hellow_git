package sec01_exam;

public class Variable_Pri_Ref {

	public static void main(String[] args) {
		
		int a; //정수값을 저장하기 위해 선언
		a = 10; //실제 값을 저장
		
		//Object클래스는 모든 클래스의 최고 조상클래스
		//print()메서드 안에 참조변수가 들어가면 주소값이 출력이 된다.
		//즉 toString()가 자동 호출이 된다.
		Object obj = new Object();
		System.out.println(obj);
		
		//참조형 변수
		//주소값만 가질수 있다. 하여, null로 초기화가 가능하다.
		String str = null;
		str = new String("자바");
		
		System.out.println(str);
		System.out.println("a의 값 : " + a);
		
		String str2 = null;
		System.out.println(str2);

	}

}
