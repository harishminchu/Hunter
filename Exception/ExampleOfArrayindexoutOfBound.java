import java.util.ArrayList;
import java.util.List;

public class ExampleOfArrayindexoutOfBound {

	public static void main(String[] args) {

		try {
			List<String> list = new ArrayList<String>();

			System.out.println(list.get(1));

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
