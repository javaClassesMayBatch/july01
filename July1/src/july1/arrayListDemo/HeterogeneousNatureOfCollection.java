package july1.arrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class HeterogeneousNatureOfCollection {
	public static void main(String args[]){
		//heterogeneous nature of List
		List list1 = new ArrayList();
		list1.add(1);
		list1.add("Sagar");
		list1.add(true);
		System.out.println(list1.toString());
	}
}
