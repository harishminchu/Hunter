public class ExampleOfClassCastException{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			Object object = new Integer("2");

			String number = (String) object;

			// / why ths line of code through compilation time Exception int i =
			// (int) object;

		} catch (Exception e) {
			
			System.out.println("ClassCastException  " + e);
		}

	}

}
