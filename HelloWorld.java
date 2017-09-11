
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Visa....");

		String a = new String("bubba");
		String b = new String("bubba1");

		String x = b.intern();
		String c = "bubba";
		System.out.println(a == x);
		System.out.println(x == c);
		System.out.println(x = b);

		Integer dd = new Integer(99);
		int r = 99;
		System.out.println(dd.intValue() * 9);

		int t = 9;
		t = 10;

		int xx = 0;
		while (xx < 10) {
			System.out.println("This is infinite.....");
			xx++;
		}
		xx = 0;
		do {
			System.out.println("Do While...");
			xx++;
		} while (xx < 10);

		for (int i = 0; i < 10; i++) {
			System.out.println("For loop....yo");
		}

		switch ("yo") {
		case "yo":
			System.out.println("Found yo....");
			break;
		case "bubba":
			System.out.println("Found bubba...");
		default:
			break;
		}
		while (true) {
			System.out.println("In the goto...");
			if (xx == 20) {
				System.out.println("This is while");
				break;
			}
			xx++;
		}
		
	}

}
