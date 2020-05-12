package sec01_exam;

public class VarEx1 {
	//main() : 프로그램의 시작점(Unique)
	public static void main(String[] args) {
		//변수 선언과 동시에 초기화를 하고 있다.
		int year = 0;
		int age = 14;
		boolean t = true;
		//sys를 치고 ctrl + space를 누르면 단축키가 나온다.
		System.out.println("year의 값 : " + year);
		System.out.println("age의 값 : " + age);
		System.out.println("t의 값 : " + t);
		
		System.out.println();
		
		//변수 age의 값에 2000을 더해서 변수 year에 저장
		year = age + 2000;
		age = age + 1;
		System.out.println("year의 값 : " + year);
		System.out.println("age의 값 : " + age);

	}

}
