public class StackTracer {

	public static void m1(){
		m12();
	}

	public static void m12(){

		StackTraceElement[] ele =Thread.currentThread().getStackTrace();
		for (StackTraceElement stackTraceElement : ele) {
			System.out.println(stackTraceElement);
		}
	}
	public static void main(String[] args) {
			m1();
	}

}