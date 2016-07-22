package Exercise.WeekTwo;


public class Display {
	private int value = 0;
	private int limit = 0; //��������������ĳ�Ա��������ʼ��

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

	//�޷��ʿ������Σ���ֻ���ڰ��ڿɼ�
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
