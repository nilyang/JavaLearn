package Exercise.WeekThree;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayMapHash {

	public static void main(String[] args) {
		//testMap();
		//testArrayList();
		//testArrayListString();
		
		testHash();
	}
	
	public static void testHash()
	{
		Coin c = new Coin();
		System.out.println(c.getCoinNames());
		
	}
	
	public static void testArrayListString()
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("first");
		a.add("second");
		System.out.println(a);
	}
	
	public static void testNormalArray()
	{
		int[] a = new int[5];
		for(int v:a){
			System.out.println(v);
			v=1;//���ܸı�a����Ԫ�ص�ֵ���Ƕ�������forѭ���ǿ�����������
		}
		
		for(int v:a){
			System.out.println(v);
		}
		
	}

	public static void testArrayList()
	{
		ArrayList<Value> a = new ArrayList<Value>();
		a.add(new Value());
		a.add(new Value());
		for(Value v:a){
			System.out.println(v.get());
			v.set(3);//
		}
		
		for(Value v:a){
			System.out.println(v.get());
		}
		
		System.out.println(a);
	}
	
	
	public static void testObjectArray()
	{
		Value[] a = new Value[10];
		for(int i=0;i<a.length;i++){
			a[i] = new Value();
			a[i].set(i);
		}

		//a ���������ÿһ��Ԫ��ֻ��һ��ָ���������ã�����ָ�룩
		for(Value v: a){
			//System.out.println(v);//Exercise.WeekThree.Value@15db9742
			System.out.println(v.get());
			v.set(0);
		}

		for(Value v:a){
			System.out.println(v.get());// 0
		}
	}

	public static void testMap()
	{
		
		
		HashSet<String> s = new HashSet<String>();
		s.add("first");
		s.add("second");
		s.add("first");
		System.out.println(s);
		
	}


}
