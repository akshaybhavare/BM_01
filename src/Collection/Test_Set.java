package Collection;

import java.util.HashSet;
import java.util.Set;

public class Test_Set {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		System.out.println(set);               //[20, 40, 10, 30]
		System.out.println(set.contains(30));  //true
		System.out.println(set.isEmpty());     //false
		System.out.println(set.remove(40));    //true
		set.clear();
		System.out.println(set);               //[]
		System.out.println(set.isEmpty());     //true
		

	}

}
