package sec01_exam;

public class VarEx2 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int tmp = 0; //두개의 값을 바꾸기 위해서는 임시변수가 필요하다.
		
		System.out.println("바꾸기 전");
		System.out.println("x값 : " + x + "y값 : " + y);
		//값 바꾸기
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("바꾼 후");
		System.out.println("x값 : " + x + "y값 : " + y);
		
	}

}
