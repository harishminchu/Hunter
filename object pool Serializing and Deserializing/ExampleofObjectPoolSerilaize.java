import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ExampleofObjectPoolSerilaize {

	public static void main(String[] args) {

		XStream xStream = new XStream(new DomDriver());

		Fruit fruit = new Apple();

		fruit.setName("apple");

		xStream.alias("fruit", Fruit.class);

		String xml = (String) xStream.toXML(fruit);

		System.out.println("" + xml);

		Apple apple = (Apple) xStream.fromXML(xml);

		System.out.println(apple.name);

	}

}
