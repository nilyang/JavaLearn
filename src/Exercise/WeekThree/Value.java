package Exercise.WeekThree;

public class Value
{
	private int i;
	public void set(int i){this.i=i;}
	public int get(){return i;}

	/**
	 * toString 用于将Value对象当字符输出时调用，类似PHP魔术方法
	 * 如果没有这个方法，则输出类似如下对象的形式：
	 * Exercise.WeekThree.Value@15db9742, Exercise.WeekThree.Value@6d06d69c
	 */
	public String toString(){return ""+i;}
}
