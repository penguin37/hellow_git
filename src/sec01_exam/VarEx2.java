package sec01_exam;

public class VarEx2 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int tmp = 0; //�ΰ��� ���� �ٲٱ� ���ؼ��� �ӽú����� �ʿ��ϴ�.
		
		System.out.println("�ٲٱ� ��");
		System.out.println("x�� : " + x + "y�� : " + y);
		//�� �ٲٱ�
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("�ٲ� ��");
		System.out.println("x�� : " + x + "y�� : " + y);
		
	}

}
