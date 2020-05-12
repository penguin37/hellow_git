package sec01_exam;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//ctrl + shift + o 를 누르면 자동 임포트
		//입력스트림을 사용하겠다고 Scanner클래스를 생성함(콘솔로부터 입력)
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 자리의 정수를 하나 입력해주세요.> ");
		int num = scanner.nextInt();
		System.out.println("입력받은 num값 : " + num);
		
		System.out.println();
		
		//dnum에다가 8바이트 메로리공간에 실수(double형)를 받겠다.
		System.out.print("두 자리의 실수를 하나 입력해주세요.> ");
		double dnum = scanner.nextDouble();
		System.out.println("입력받는 dnum값 : " + dnum);
		
		System.out.print("문자열을 입력해주세요.> ");
		//next() 공백 앞까지만 문자열로 받는다.
		//String str = scanner.next();
		scanner.nextLine(); //버퍼비우기
		//nextLine() 엔터키가 입력될 때가지를 문자열로 다 인식
		String str = scanner.nextLine();
		System.out.println("입력받은 문자열: " + str);
		
		//입력받은 문자열을 숫자로 변환
		int value = Integer.parseInt(str);
		System.out.println(value);
		
		scanner.close();

	}

}
