package List_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Create_ArrayList {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList();
		
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(55);
		
		System.out.println(al);
//		************ Adding Colection into ArrayList  ****************
		List<Integer> al1=new ArrayList();
		al1.add(152);
		al1.add(200);
		al1.add(251);
		al1.add(555);
		
		al.addAll(al1);
		System.out.println("After Adding Colection into Odl array :->"+al);
		LinkedList ll2=new LinkedList();
		ll2.add(152);
		ll2.add(256);
	}
}
