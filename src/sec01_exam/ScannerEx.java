package sec01_exam;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//ctrl + shift + o �� ������ �ڵ� ����Ʈ
		//�Է½�Ʈ���� ����ϰڴٰ� ScannerŬ������ ������(�ַܼκ��� �Է�)
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� �ڸ��� ������ �ϳ� �Է����ּ���.> ");
		int num = scanner.nextInt();
		System.out.println("�Է¹��� num�� : " + num);
		
		System.out.println();
		
		//dnum���ٰ� 8����Ʈ �޷θ������� �Ǽ�(double��)�� �ްڴ�.
		System.out.print("�� �ڸ��� �Ǽ��� �ϳ� �Է����ּ���.> ");
		double dnum = scanner.nextDouble();
		System.out.println("�Է¹޴� dnum�� : " + dnum);
		
		System.out.print("���ڿ��� �Է����ּ���.> ");
		//next() ���� �ձ����� ���ڿ��� �޴´�.
		//String str = scanner.next();
		scanner.nextLine(); //���ۺ���
		//nextLine() ����Ű�� �Էµ� �������� ���ڿ��� �� �ν�
		String str = scanner.nextLine();
		System.out.println("�Է¹��� ���ڿ�: " + str);
		
		//�Է¹��� ���ڿ��� ���ڷ� ��ȯ
		int value = Integer.parseInt(str);
		System.out.println(value);
		
		scanner.close();

	}

}
