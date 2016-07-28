package QA.WeekThree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		test();
	}

	//TODO 下三角矩阵存储里程表，可以尝试
	public static void test()
	{
		
		String pattern = "\\s+";
		
		//read cities
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] cities = line.split(pattern);
		int city_count = cities.length;

		//read distance
		String[] dist_array;
		int line_count = 0;
		DistanceMap distmap = new DistanceMap();
		while (line_count < city_count && scan.hasNextLine()) {
			line = scan.nextLine();
			dist_array = line.split(pattern);
			
			if(dist_array.length!=line_count){
				//TODO throw error
			}
			
			String from = cities[line_count];
			
			for(int j = 0; j<city_count; j++){
				String dist = cities[j];
				int distance = Integer.parseInt(dist_array[j]);
				distmap.add(from, dist, distance);
			}
			
			line_count++;
		}
		
		System.out.println();
		distmap.print();
		int try_times = 0;
		while(true){
			System.out.println("输入城市");
			line = scan.nextLine();
			cities = line.split(pattern);
			int dist = distmap.search(cities[0], cities[1]);			
			System.out.println(cities[0] + "和"+ cities[1] +"距离：" +dist);
			System.out.println();
			if(try_times++>5){
				scan.close();
			}
		}
	}
	
}
