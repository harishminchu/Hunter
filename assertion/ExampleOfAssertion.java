import java.util.Scanner;

public class ExampleOfAssertion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter ur number ");

		int val = scanner.nextInt();

		assert val >= 18 : "Not valid";
		System.out.println(val);

	}

}
