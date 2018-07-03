package july1.arrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class CollectionAPIs {
	public static void main(String args[]){
		List<String> list1 = new ArrayList<String>();
		//add
		list1.add("Sagar");
		list1.add("Sagar");
		list1.add("Sagar");
		list1.add("Sagar");
		list1.add("Sagar");
		list1.add("Sagar");
		list1.add("Sagar");
		list1.add("Sagar");
		list1.add("Sagar");
		list1.add("Sagar");
		list1.add("Sagar");
		//System.out.println(list1.toString());
		
		//addAll
		List<String> list2 = new ArrayList<String>();
		list2.add("Shubham");
		list2.addAll(list1);
		//System.out.println(list2.toString());
		
		//remove
		list1.remove("Sagar");
		//System.out.println(list1.toString());
		
		//clear
		list2.clear();
		//System.out.println(list2.toString());
		
		//isEmpty
		//System.out.println(list2.isEmpty());
		
		//removeAll
		list2.add("Shubham");
		list2.add("Sagar");
		list2.add("Sagar");
		list2.add("Sagar");
		list2.add("Ritesh");
		List<String> list3 = new ArrayList<String>();
		list3.add("Shubham");
		list3.add("Sagar");
		
		list2.removeAll(list3);
		//System.out.println(list2.toString());
		
		//isEmpty
		//System.out.println(list2.isEmpty());
		
		//retainAll
		list2.clear();
		list3.clear();
		
		list2.add("Shubham");
		list2.add("Sagar");
		list2.add("Sagar");
		list2.add("Sagar");
		list2.add("Ritesh");
		
		list3.add("Shubham");
		list3.add("Sagar");
		
		list2.retainAll(list3);
		//System.out.println(list2.toString());
		
		//contains
		//System.out.println(list2.contains("Ritesh"));
		//System.out.println(list2.contains("Sagar"));
		
		//containsAll
		list2.clear();
		list3.clear();
		
		list2.add("Shubham");
		list2.add("Sagar");
		list2.add("Sagar");
		list2.add("Sagar");
		list2.add("Ritesh");
		
		list3.add("Shubham");
		list3.add("Sagar");
		//System.out.println(list2.containsAll(list3));
		
		list3.add("Arun");
		//System.out.println(list2.containsAll(list3));
		
		//size
		//System.out.println(list1.size());
		//System.out.println(list2.size());
		//System.out.println(list3.size());
		
		//String[] strArray = (String[])list2.toArray();
		//System.out.println(strArray);
	}
}
