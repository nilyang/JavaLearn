package QA.WeekOne;

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

class Fraction {
	int Numerator;   //分子
	int Denominator; //分母
	
	Fraction(int a , int b)
	{
		Numerator = a;
		Denominator = b;
	}
	
	double toDouble()
	{
		return Numerator / Denominator;
	}

	Fraction plus(Fraction r)
	{
		int lcm = r.Denominator * this.Denominator / gcd(r.Denominator,this.Denominator);
		int r_times = lcm / r.Denominator;
		int this_times = lcm / this.Denominator;
		int numer = this.Numerator* this_times + r.Numerator*r_times;
		return new Fraction(numer, lcm);
	}

	Fraction multiply(Fraction r)
	{
		return new Fraction(r.Numerator * this.Numerator, r.Denominator * this.Denominator);
	}

	/**
	 * 辗转相除法
	 * @see http://wenku.baidu.com/view/61a1b24703d8ce2f0066236b.html?from=search
	 * @param m
	 * @param n
	 * @return
	 */
	int gcd(int m, int n)
	{
		int r;
		if(m == n){
			return m;
		}
		if(m < n){ //exchange m and n
			r = m;
			m = n;
			n = r;
			r = 0;
		}

		do{
			r = m % n;
			m = n;
			n = r;
		}while(r !=0);

		return m;
	}

	void print()
	{
		int gcd_num = gcd(this.Numerator, this.Denominator);
		String result = this.Numerator == this.Denominator ?
				"1" : (Numerator/gcd_num +  "/" + Denominator/gcd_num) ; 
		System.out.println( result );
	}
}
