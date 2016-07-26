package Exercise.WeekTwo;

public class BasicTest {

	public static void main(String[] args) {
		BasicTest b = new BasicTest();
		//b.test_ascii();
		b.test_char_boxing();
		b.test_int_boxing();
	}

	public void test_ascii()
	{
		for(char c=0; c < 128; c++)
			if(Character.isAlphabetic(c))
				System.out.println("Value:" + (int)c 
						+ " Character: " + c);
	}

	public void test_char_boxing()
	{
 		Character c = 's';
		c =  333;
		System.out.println(  c.hashCode() );
	}
	
	public void test_int_boxing()
	{
		Integer a = 1000;
		Integer b = 1000;
		System.out.println(a == b);

		Integer g = 127;
		Integer h = 127;

		System.out.println( g == h);

		Integer i = 128;
		Integer j = 128;
		System.out.println( i == j);
		
		int k = 128;
		int l = 128;
		System.out.println( k == l);
	}

}
