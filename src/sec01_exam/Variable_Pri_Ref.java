package sec01_exam;

public class Variable_Pri_Ref {

	public static void main(String[] args) {
		
		int a; //�������� �����ϱ� ���� ����
		a = 10; //���� ���� ����
		
		//ObjectŬ������ ��� Ŭ������ �ְ� ����Ŭ����
		//print()�޼��� �ȿ� ���������� ���� �ּҰ��� ����� �ȴ�.
		//�� toString()�� �ڵ� ȣ���� �ȴ�.
		Object obj = new Object();
		System.out.println(obj);
		
		//������ ����
		//�ּҰ��� ������ �ִ�. �Ͽ�, null�� �ʱ�ȭ�� �����ϴ�.
		String str = null;
		str = new String("�ڹ�");
		
		System.out.println(str);
		System.out.println("a�� �� : " + a);
		
		String str2 = null;
		System.out.println(str2);

	}

}
