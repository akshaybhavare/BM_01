package Collection;

import java.util.HashMap;
import java.util.Map;


public class Test_Map {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("test1", 10);
		map.put("test2", 40);
		map.put("test3", 30);
		map.put("test4", 40);
		map.put("test4", 40);
		map.put("test5", 40);
		System.out.println(map); //{test4=40, test5=40, test2=40, test3=30, test1=10}
		map.put("test4", 50);
		System.out.println(map); //{test4=50, test5=40, test2=40, test3=30, test1=10}
		
		System.out.println(map.containsKey("test4")); //true
		
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+"=="+e.getValue());  //test4==50.....
		}
		
		
		
		
		
	}

}
