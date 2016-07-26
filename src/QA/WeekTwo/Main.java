package QA.WeekTwo;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}

}

class Display {
	int value = 0;
	int limit = 0;

	Display(int limit) {
		this.limit = limit;
	}

	public void increase() {
		value = value + 1;
		if (value == limit) {
			value = 0;
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int val) {
		value = val;
	}
}

class Clock {
	Display hour = new Display(24);
	Display minute = new Display(60);
	Display second = new Display(60);

	Clock(int hour, int minute, int second) {
		if (hour > 23 || minute > 59 || second > 59 
				|| hour < 0 || minute < 0 || second < 0) {
			throw new IllegalArgumentException("²ÎÊý´íÎó");
		}
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);
	}

	public void tick() {
		second.increase();
		if (second.getValue() == 0) {
			minute.increase();
			if (minute.getValue() == 0) {
				hour.increase();
			}
		}
	}

	public String toString() {
		return String.format("%1$02d", this.hour.getValue()) + ":" + String.format("%1$02d", this.minute.getValue()) + ":"
				+ String.format("%1$02d", this.second.getValue());
	}

}