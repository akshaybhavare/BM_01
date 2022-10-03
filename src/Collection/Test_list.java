package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test_list {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		System.out.println(list);  //[1, 2, 3, 4, 4]
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(20);
		
		System.out.println(list1.contains(10)); // true
		list.addAll(list1);   
		System.out.println(list);  //[1, 2, 3, 4, 4, 10, 20, 20]
		list1.remove(0);
		System.out.println(list1); //[20, 20]
		list1.clear(); 
		System.out.println(list1); //[]

//		List list=new ArrayList();
//		list.add(12.5);
//		list.add("test");
//		list.add(12);
//		list.add(12);
//		System.out.println(list); //[12.5, test, 12, 12]
//		
//		LinkedList listlink=new LinkedList();
//		listlink.add("test10");
//		listlink.add(122);
//		listlink.add(122);
//		System.out.println(listlink);  //[test10, 122, 122]
		
//		Set set=new HashSet();
//		set.add(10);
//		set.add(10);
//		set.add("aaaa");
//		set.add('s');
//		System.out.println(set);  //[s, 10, aaaa]
//		
//		Iterator it=set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());   //s.....
//		}
	}

}
