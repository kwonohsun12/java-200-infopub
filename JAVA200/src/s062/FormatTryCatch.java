package s062;

//������ �Է� ���� �� �߻��� �� �ִ� ���� ó���ϱ�
//try catch�� �̿��Ͽ� ���ܸ� ó���Ѵ�.

public class FormatTryCatch {
	public static void main(String[] args) {
		String sNum = "��";
		String nNum = "h";
		try {
			int a = Integer.parseInt(sNum);
			System.out.println(a);
		} catch (NumberFormatException ee) {
			System.out.println("int���� Ȯ���� ��!");
			System.out.println(ee.getMessage());
		} catch (Exception ee) {
			System.out.println("�� �� �� �־�");
		} finally {
			System.out.println("�� ����Ǿ�߸� ��!!");
		}

	}
}