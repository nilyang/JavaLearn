# ��һ����Ŀ

��Ŀ���ݣ�


> ���һ����ʾ��������Fraction�������������int���͵ı����ֱ��ʾ���Ӻͷ�ĸ��


�����Ĺ��캯���ǣ�



```

Fraction(int a, int b)

// ����һ��a/b�ķ�����
```


�����Ҫ�ṩ���µĹ��ܣ�


```

double toDouble();

    //������ת��Ϊdouble


Fraction plus(Fraction r);

    //���Լ��ķ�����r�ķ�����ӣ�����һ���µ�Fraction�Ķ���ע��Сѧ���꼶ѧ���������������ӵĹ���


Fraction multiply(Fraction r);

    //���Լ��ķ�����r�ķ�����ˣ�����һ���µ�Fraction�Ķ���

void print();

    //���Լ��ԡ�����/��ĸ������ʽ�������׼����������лس����С����������1/1��Ӧ�����1�������Ӵ��ڷ�ĸʱ������Ҫ����������֣���31/30��һ����ȷ�������


```


**ע�⣬�ڴ��������������Ӧ�û������Ϊ�����ʽ����2/4Ӧ�ñ�����Ϊ1/2��**


��д����Ҫ�����µĴ������һ�𣬲������޸�������룺


```Java

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}
}

```



ע�⣬�����Ķ���Ӧ��������ʼ��



```
class Fraction {

```


Ҳ����˵����������classǰ�治Ҫ��public��



�����ʽ:


��������ʱ��õ��ĸ����֣��ֱ𹹳����������������Ƿ��Ӻͷ�ĸ��




�����ʽ��


���һЩ��ʽ����Щ��������������Main��Ĵ�����ɵģ���Ĵ��벻Ҫ������������


����������

```

2 4 1 3

```



���������


```
1/2
1/3
5/6
1
1/2
1/3

```




ʱ�����ƣ�500ms�ڴ����ƣ�32000kb