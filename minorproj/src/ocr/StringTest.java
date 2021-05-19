package ocr;

public class StringTest {

	public static void main(String[] args) {
		String x="Hello from the otherrrr sideeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee "+
				"atleast i considered i triedddd to tellll youuuu im sorrryyyyy for breakin' your heart .... 7 + 9";
			
			String arr[]=x.split("\\+");
			System.out.println("left side :"+arr[0]);
			System.out.println("right side :"+arr[1]);
			}

}
