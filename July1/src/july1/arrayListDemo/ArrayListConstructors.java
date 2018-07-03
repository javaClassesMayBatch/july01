package july1.arrayListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListConstructors {
	public static void main(String a[]){
		
//		1. ArrayList al = new ArrayList();
		List<String> list1 = new ArrayList<String>();
		
	//	2. ArrayList al = new ArrayList(int capacity);
		List<String> list2 = new ArrayList<String>(20);
				
		//3. ArrayList al = new ArrayList(Collection c);
		Set<String> set1 = new TreeSet();
		set1.add("sagar");
		List<String> list3 = new ArrayList<String>(set1);
		
		System.out.println(list3);
	}
}
