package sec01_exam; //sce01_exam이라는 폴더내에 PrintfEx1. Java파일이 저장이 된다.

public class PrintfEx1 {

	public static void main(String[] args) {
		
		byte b =  1; //1바이트
		short s = 2; //2바이트
		char c = 'A'; //2바이트(C언어에서는 char타입은 1바이트임)-유니코드
		int finger = 10; //4바이트, 정수형의 기본형(default타입)
		long big = 1000000L; //8바이트
		
		int octNum = 010; //8진수 10 = (8*1) + (0*1), 10진수로는 8이다.
		int hexNum = 0x10; //16진수, 10진수로는 16이다.
		int binNum = 0b10; //2진수, 10진수로는 2이다.
		int num = 255;
		
		//%d는 서식(형식)출력형태, %n은 개행(enter), 반드시 형식지정자의 갯수와 그에 
		//상응하는 매개변수의 개수가 동일해야 한다.
		System.out.printf("b = %d %n", b); 
		System.out.printf("s = %d %n", s);
		System.out.printf("c = %c, A의 아스키코드 값 : %d %n", c, (int)c);
		//자릿수 지정
		System.out.printf("finger = [%5d] %n", finger);
		System.out.printf("finger = [%-5d] %n", finger);
		System.out.printf("finger = [%05d] %n", finger);
	
		System.out.printf("big = %d %n", big);
		//진수값 출력
		System.out.printf("octNum = %o, %d %n", octNum, octNum); //8진수의 형식지정자는 %o
		System.out.printf("hexNum = %#x, %d %n", hexNum, hexNum); //16진수의 형식지정자는 %#x
		System.out.printf("binNum = %s, %d %n", Integer.toBinaryString(binNum), binNum);
		//10진수를 각각의 정수값으로 변환하고 있다.
		System.out.printf("255를 2진수로 바꾼 값 = %s %n", Integer.toBinaryString(num));
		System.out.printf("255를 8진수로 바꾼 값 = %s %n", Integer.toOctalString(num));
		System.out.printf("255를 16진수로 바꾼 값 = %s %n", Integer.toHexString(num));
		
		
	}

}
