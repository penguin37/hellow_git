package sec01_exam;

public class StringEx {

	public static void main(String[] args) {
		
		//name, str��  StringŬ���� Ÿ���� ������ �ִ�.
		//name, str�� ������ �����̴�.
		String name = new String("ja" + "va");
		String str = new String(name + 8.0);
		
		//any type + ���ڿ�(String) = ���ڿ�(String)
		// +�� ������ ���ڿ��� �̾��ִ� ����
		System.out.println(name.toString());
		System.out.println(str.toString());
		
		System.out.println(123456789);
		
	}

}
