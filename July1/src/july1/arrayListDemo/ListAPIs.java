package july1.arrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListAPIs {
	public static void main(String args[]){
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		// add
		list1.add(0,"a");
		list1.add(1,"b");
		list1.add(0,"c");
		// System.out.println(list1.toString());
		
		// addAll
		list2.add("d");
		list2.addAll(0,list1);
		list2.add("e");
		System.out.println(list2.toString());

		// get
		// System.out.println(list1.get(1));
		
		// remove
		list1.remove(1);
		// System.out.println(list1.toString());
		
		// set
		list1.set(0, "z");
		// System.out.println(list1.toString());

		// indexOf
		// System.out.println(list2.indexOf("z"));
		// System.out.println(list2.indexOf("b"));
		
		// lastIndexOf
		list2.add("a");
		System.out.println(list2.indexOf("a"));
		System.out.println(list2.lastIndexOf("a"));
		
	}
}
