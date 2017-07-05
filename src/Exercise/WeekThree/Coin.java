package Exercise.WeekThree;

import java.util.HashMap;

/**
 * 定义一个哈希类 给以一个数字，返回一个string
 * 
 * @author nilyang
 * 
 */
public class Coin {
	//容器不能使用基本变量类型，只能使用相应的对象类类型
	private HashMap<Integer,String> coinNames = new HashMap<>();
	
	public Coin()
	{
		coinNames.put(1, "penny");
		coinNames.put(10, "dime");
		coinNames.put(25, "quarter");
		coinNames.put(50, "half-dolar");//同键名，后者生效
		coinNames.put(50, "五毛");//同键名，后者生效
		
		System.out.println(coinNames.keySet().size());
		System.out.println(coinNames);
		
		for(Integer k: coinNames.keySet()){
			String s = coinNames.get(k);
			System.out.println(s);
		}
	}

	public HashMap<Integer, String> getCoinNames()
	{
		return coinNames;
	}
	
	public String getName(int amount)
	{
		//直接调用 coinNames.get amount越界，则会返回null
		if (coinNames.containsKey(amount)){
			return coinNames.get(amount);
		}else{
			return "Not Found";
		}
	}
}
