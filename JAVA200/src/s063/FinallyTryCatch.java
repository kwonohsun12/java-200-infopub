package s063;

public class FinallyTryCatch {

	public static void main(String[] args) {
		try {
			// divide by zero
			int x = 5;
			int y = 20 / (5 - x); // 여기에서 예외를 던진다.
			System.out.println(y);

		} catch (ArithmeticException e) { // run time
			System.out.println("0으로 나눴나 확인해보세요~");
			//e.printStachTrace();
		} finally {
			System.out.println("난 수행되어야 해!!!");
		}

	}
}
