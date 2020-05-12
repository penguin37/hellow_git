package sec01_exam; //sce01_exam�̶�� �������� PrintfEx1. Java������ ������ �ȴ�.

public class PrintfEx1 {

	public static void main(String[] args) {
		
		byte b =  1; //1����Ʈ
		short s = 2; //2����Ʈ
		char c = 'A'; //2����Ʈ(C������ charŸ���� 1����Ʈ��)-�����ڵ�
		int finger = 10; //4����Ʈ, �������� �⺻��(defaultŸ��)
		long big = 1000000L; //8����Ʈ
		
		int octNum = 010; //8���� 10 = (8*1) + (0*1), 10�����δ� 8�̴�.
		int hexNum = 0x10; //16����, 10�����δ� 16�̴�.
		int binNum = 0b10; //2����, 10�����δ� 2�̴�.
		int num = 255;
		
		//%d�� ����(����)�������, %n�� ����(enter), �ݵ�� ������������ ������ �׿� 
		//�����ϴ� �Ű������� ������ �����ؾ� �Ѵ�.
		System.out.printf("b = %d %n", b); 
		System.out.printf("s = %d %n", s);
		System.out.printf("c = %c, A�� �ƽ�Ű�ڵ� �� : %d %n", c, (int)c);
		//�ڸ��� ����
		System.out.printf("finger = [%5d] %n", finger);
		System.out.printf("finger = [%-5d] %n", finger);
		System.out.printf("finger = [%05d] %n", finger);
	
		System.out.printf("big = %d %n", big);
		//������ ���
		System.out.printf("octNum = %o, %d %n", octNum, octNum); //8������ ���������ڴ� %o
		System.out.printf("hexNum = %#x, %d %n", hexNum, hexNum); //16������ ���������ڴ� %#x
		System.out.printf("binNum = %s, %d %n", Integer.toBinaryString(binNum), binNum);
		//10������ ������ ���������� ��ȯ�ϰ� �ִ�.
		System.out.printf("255�� 2������ �ٲ� �� = %s %n", Integer.toBinaryString(num));
		System.out.printf("255�� 8������ �ٲ� �� = %s %n", Integer.toOctalString(num));
		System.out.printf("255�� 16������ �ٲ� �� = %s %n", Integer.toHexString(num));
		
		
	}

}
