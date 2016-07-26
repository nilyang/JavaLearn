package Exercise.WeekTwo;


public class AllOps
{
	public static void main(String[] args) {
		AllOps a = new AllOps();
		a.boolTest(true, false);
		a.testString("Fuck", "Fuck2");
		a.charTest('z', 'f');
		a.maxIntTest();

	}
	
	void f(boolean b){
		System.out.println(b);
	}
	void boolTest(boolean x ,boolean y)
	{
		f(x==y);
	}
	
	void charTest(char x, char y)
	{
		x = (char) (x * y);
		x = (char) (x / y);
		x = (char) (x + y);
		x = (char) (x - y);
		x++;
		x--;
		x = (char)+y;
		x = (char)-y;
		String str = String.format("x=%s,y=%s", x, y);
		System.out.println(str);
		
	}

	void maxIntTest()
	{
		int big = Integer.MAX_VALUE;
		System.out.println(big);
		int bigger = big * 4;
		System.out.println(bigger);
	}
	
	void testString(String a, String b)
	{
		System.out.println("a.equals(b) " + a.equals(b));
		System.out.println("a.equalsIgnoreCase(b) " + a.equalsIgnoreCase(b));
		System.out.println("a == b " + (a == b));
		System.out.println("b != a " + (b != a));
		System.out.println("a = " + a + ", b = " + b);
	}
}