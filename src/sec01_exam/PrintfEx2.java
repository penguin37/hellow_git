package sec01_exam;

public class PrintfEx2 {

	public static void main(String[] args) {
		
		float f1 = .10f;	//0.10
		float f2 = 11f;		//11.0
		float f3 = 3.14f;	//3.14
		double d1 = 1234.5623;
		
		//float, double ���������ڴ� %f�̴�. 
		//�ڸ��� ������
		//ex) %.1f Ȥ�� %.2f ��
		System.out.printf("f1 = %f %n", f1);
		System.out.printf("f1 = %.1f %n", f1);
		System.out.printf("d1 = %f %n", d1);
		
		System.out.printf("f3 = %3.2f %n", f3);
	}

}
