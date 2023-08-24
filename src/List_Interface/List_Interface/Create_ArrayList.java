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
		ArrayList al2=new ArrayList();
		al2.add(152);
		al2.add(256);

//		ArrayList Constructors:
//		1) ArrayList al=new ArrayList(); 
		 ArrayList al3=new ArrayList(); 
		
//		2) ArrayList al=new ArrayList(int initialCapacity);

		ArrayList<Integer> al5=new ArrayList<>(10);
		
//		3) ArrayList al=new ArrayList(Collection c);
		
		ArrayList <Integer> al4=new ArrayList<>(al);
		System.out.println("   ArrayList al=new ArrayList(Collection c); ->"+al );
		
	}
}
