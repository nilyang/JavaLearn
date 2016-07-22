package Exercise.WeekTwo;


public class Display {
	private int value = 0;
	private int limit = 0; //可以用其他定义的成员变量来初始化

	Display(int limit)
	{
		this.limit = limit;
	}

	public void increase()
	{
		value = value+1;
		if(value == limit){
			value = 0;
		}
	}

	//无访问控制修饰，则只能在包内可见
	int getValue()
	{
		return value;
	}

	public static void main(String[] args)
	{
		Display d = new Display(24);
		for(;;){
			d.increase();
			System.out.println(d.getValue());
		}
	}
}
