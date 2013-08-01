import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.nth.test.Person;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class EampleOfXstreamSerializingAndDeserializing {

	public static void main(String[] args) throws IOException {

		Person person = new Person();
		person.setAge(3);
		person.setAddress("rajajinagar");

		XStream stream = new XStream(new DomDriver());

		// Serializing an object to XML

		stream.alias("person", Person.class);
		String xml = (String) stream.toXML(person);
		System.out.println(xml);//

		FileWriter fileWriter = new FileWriter(new File("D:\\tools\\read.txt"));

		fileWriter.write(xml);
		fileWriter.flush();
		fileWriter.close();

		// Deserializing an object back from XML
		Person newJoe = (Person) stream.fromXML(xml);
		Person baby = (Person) stream.fromXML(new File("D:\\tools\\read.txt"));

		System.out.println(baby.getAddress());

	}

}
