package s063;

public class FinallyTryCatch {

	public static void main(String[] args) {
		try {
			// divide by zero
			int x = 5;
			int y = 20 / (5 - x); // ���⿡�� ���ܸ� ������.
			System.out.println(y);

		} catch (ArithmeticException e) { // run time
			System.out.println("0���� ������ Ȯ���غ�����~");
			//e.printStachTrace();
		} finally {
			System.out.println("�� ����Ǿ�� ��!!!");
		}

	}
}