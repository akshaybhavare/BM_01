package Collection;

import java.util.HashMap;
import java.util.Map;


public class Test_Map1 {

	public static void main(String[] args) {
		
		Map<Object,Object> map=new HashMap<Object,Object>();
		map.put("test1", 10);
		map.put("test2", 20.5);
		map.put("test3", 20.5);

		System.out.println(map);
		map.put("test2", 40);
//		map.put(test, 10);
		System.out.println(map);
		
		for(Map.Entry<Object, Object> e: map.entrySet()) {
			System.out.println(e.getKey()+"=="+e.getValue());
		}
		

		
		

	}

}
