# �ڶ�����Ŀ

## ��Ŀ���ݣ�

> ��һ�ܵı��������Ҫ���ڿγ�������ʱ�ӳ���Ļ������޸Ķ��ɡ��������ǲ���ֱ�Ӹ���ʱ�ӳ���Ĵ��룬�������Ƶ�Լ�����ʱ�ӳ����Display��Clock��Ĵ��룬Ȼ�����������Ŀ��
>  ������Ҫ��ʱ�ӳ������һ����ʾ���Display��Ȼ��ΪClock��������public�ĳ�Ա������


```
public Clock(int hour, int minute, int second);

   // ��hour, minute��second��ʼ��ʱ�䡣


public void tick();

// ����ડ�һ�£�ʱ����1�롣


public String toString();

    //����һ��String��ֵ���ԡ�hh:mm:ss������ʽ��ʾ��ǰʱ�䡣����ÿ����ֵ��ռ����λ��������λʱ��0���硰00:01:22"��ע�����е�ð�������ĵģ��������ĵġ�

```



> ��ʾ��String.format()�����ú�printfһ���ķ�ʽ����ʽ��һ���ַ�����




����дһ��Main�࣬����main����Ϊ��������ӣ�ע�⣬����ԭ�ⲻ������ΪMain��main������

```

	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);

		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());

		clock.tick();

		System.out.println(clock);

		in.close();

	}
```



ע�⣡���ύ��ʱ�򣬰�Main��Clock��Display������Ĵ���ϲ���һ������Main����public�ģ���Clock��Display����û�����η��ġ����⣬ǧ��ע���һ�в�����package��䡣




���������


���ø�����main�������迼�����������



ʱ�����ƣ�500ms�ڴ����ƣ�32000kb