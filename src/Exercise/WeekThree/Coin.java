package Exercise.WeekThree;

import java.util.HashMap;

/**
 * ����һ����ϣ�� ����һ�����֣�����һ��string
 * 
 * @author nilyang
 * 
 */
public class Coin {
	//��������ʹ�û����������ͣ�ֻ��ʹ����Ӧ�Ķ���������
	private HashMap<Integer,String> coinNames = new HashMap<Integer,String>();
	
	public Coin()
	{
		coinNames.put(1, "penny");
		coinNames.put(10, "dime");
		coinNames.put(25, "quarter");
		coinNames.put(50, "half-dolar");//ͬ������������Ч
		coinNames.put(50, "��ë");//ͬ������������Ч
		
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
		//ֱ�ӵ��� coinNames.get amountԽ�磬��᷵��null
		if (coinNames.containsKey(amount)){
			return coinNames.get(amount);
		}else{
			return "Not Found";
		}
	}
}
