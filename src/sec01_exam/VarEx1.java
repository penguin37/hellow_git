package sec01_exam;

public class VarEx1 {
	//main() : ���α׷��� ������(Unique)
	public static void main(String[] args) {
		//���� ����� ���ÿ� �ʱ�ȭ�� �ϰ� �ִ�.
		int year = 0;
		int age = 14;
		boolean t = true;
		//sys�� ġ�� ctrl + space�� ������ ����Ű�� ���´�.
		System.out.println("year�� �� : " + year);
		System.out.println("age�� �� : " + age);
		System.out.println("t�� �� : " + t);
		
		System.out.println();
		
		//���� age�� ���� 2000�� ���ؼ� ���� year�� ����
		year = age + 2000;
		age = age + 1;
		System.out.println("year�� �� : " + year);
		System.out.println("age�� �� : " + age);

	}

}
